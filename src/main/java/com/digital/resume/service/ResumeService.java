package com.digital.resume.service;

import com.digital.resume.model.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface ResumeService {
    public Resume getResume();
}
