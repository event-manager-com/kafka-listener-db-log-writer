package com.propets.exceptionlogwriter.service;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface IDbWriter {
    String INPUT="input";
    @Input(INPUT)
    MessageChannel input();
}
