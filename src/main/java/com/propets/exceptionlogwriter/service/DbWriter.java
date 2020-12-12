package com.propets.exceptionlogwriter.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.propets.exceptionlogwriter.domain.LogEntity;
import com.propets.exceptionlogwriter.dto.LogDto;
import com.propets.exceptionlogwriter.repo.LogWriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(IDbWriter.class)
public class DbWriter {
    ObjectMapper mapper=new ObjectMapper();
    
    @Autowired
    private LogWriterRepository repository;

    @StreamListener(Sink.INPUT)
    void processMessage(String logJson) throws JsonProcessingException {
        LogDto logDto=mapper.readValue(logJson,LogDto.class);
        LogEntity logEntity=new LogEntity(logDto.getDate(),logDto.getTime(),logDto.getLogType(),logDto.getResource(),logDto.getMessage());
        repository.save(logEntity);
    }
}
