package com.tmobile.bootcamp.tmobilebootcamp.service.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BootcampServiceException extends Exception{

    private String errorCode;
    private String errorMessage;

}
