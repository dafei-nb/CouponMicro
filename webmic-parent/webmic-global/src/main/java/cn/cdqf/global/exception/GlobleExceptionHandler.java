package cn.cdqf.global.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobleExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String exception(Exception e){
        log.info("拦截到项目出现的不可控异常：{}",e);
        e.printStackTrace();
        //发邮箱等
        return "异常拦截";
    }
    //todo
}
