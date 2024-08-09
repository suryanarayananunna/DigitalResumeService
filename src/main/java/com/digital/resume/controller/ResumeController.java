package com.digital.resume.controller;

import com.digital.resume.model.Resume;
import com.digital.resume.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    @GetMapping("/resume")
    public Resume getResume() {
        return resumeService.getResume();
    }
}
