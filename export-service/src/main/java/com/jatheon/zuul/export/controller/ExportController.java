package com.jatheon.zuul.export.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExportController {

    private static final Logger LOG = LoggerFactory.getLogger(ExportController.class);

    @GetMapping("/hello")
    public String handle() {
        return "Hello world!";
    }

}
