package cn.cdqf.global.exception;

import lombok.Data;

@Data
public class GlobleException extends RuntimeException{
    private String message;

    public GlobleException(String message){
        super(message);
        this.message= message;
    }
}
