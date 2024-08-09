package com.digital.resume.service.impl;

import com.digital.resume.dao.ResumeDao;
import com.digital.resume.model.Resume;
import com.digital.resume.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeDao resumeDao;

    @Override
    public Resume getResume() {
        return resumeDao.getResume();
    }
}
