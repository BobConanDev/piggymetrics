package com.piggymetrics.helpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class LangMessage {

    @Autowired
    private MessageSource messageSource;

    public String get(String code, HttpServletRequest request) {
        return messageSource.getMessage(code, null, request.getLocale());
    }

}