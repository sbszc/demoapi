package com.sbszc.demoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoapiController {

    @GetMapping
    public String ping() {
        return "ping";
    }
}
