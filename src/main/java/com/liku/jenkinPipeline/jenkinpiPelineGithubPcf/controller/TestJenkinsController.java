package com.liku.jenkinPipeline.jenkinpiPelineGithubPcf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestJenkinsController {

    @GetMapping("testJenkins")
    public String helloCICD(){
           return "hello CICD";
    }
}
