package com.propets.exceptionlogwriter.dto;


public class LogDto {
    private static final long serialVersionUID = 1L;

    private String date;
    private String time;
    private String logType;
    private String resource;
    private String message;

    public LogDto() {
    }

    public LogDto(String date, String time, String logType, String resource, String message) {
        this.date = date;
        this.time = time;
        this.logType = logType;
        this.resource = resource;
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
