package com.propets.exceptionlogwriter.repo;

import com.propets.exceptionlogwriter.domain.LogEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogWriterRepository  extends MongoRepository<LogEntity,String> {
}
