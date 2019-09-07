package com.test.settlement.controller.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class NoContentException extends Exception
{
    String exception;

    public NoContentException(String exception)
    {
        this.exception = exception;
    }
}
