package com.test.settlement.controller.exception;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class RequestBadParamException extends Exception
{
    String exception;

    public RequestBadParamException(String exception)
    {
        this.exception = exception;
    }
}
