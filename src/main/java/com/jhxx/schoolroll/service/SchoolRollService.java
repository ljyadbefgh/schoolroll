package com.jhxx.schoolroll.service;

import com.jhxx.schoolroll.dao.SchoolRollDao;
import com.jhxx.schoolroll.model.SchoolRoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolRollService {
    @Autowired
    private SchoolRollDao schoolRollDao;


    public void save(SchoolRoll schoolRoll){
        schoolRollDao.save(schoolRoll);
    }
}
