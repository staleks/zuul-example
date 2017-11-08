package com.jatheon.zuul.export.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExportController {

    private static final Logger LOG = LoggerFactory.getLogger(ExportController.class);

    @Value("${greeting.message}")
    private String greetingMessage;

    @GetMapping("/hello")
    public String handle() {
        return greetingMessage;
    }

}
