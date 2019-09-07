package com.test.settlement.controller.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author deepak.udyawar
 *         Builds the {@link ControllerAdvice} annotation to handle the
 *         Exceptions globally across all Controllers.
 */
@ControllerAdvice
public class RestResponseExceptionHandler
{

    @ExceptionHandler({ RequestBadParamException.class })
    @ResponseBody
    public ResponseEntity handleBadRequestFailures(Exception e)
    {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("exception",
                        e.getMessage());
        return new ResponseEntity<>(null,
                                    httpHeaders,
                                    HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({ NoContentException.class })
    @ResponseBody
    public ResponseEntity handleNoContentResponseFailures(Exception e)
    {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("exception",
                        e.getMessage());
        return new ResponseEntity<>(null,
                                    httpHeaders,
                                    HttpStatus.NO_CONTENT);
    }

}
