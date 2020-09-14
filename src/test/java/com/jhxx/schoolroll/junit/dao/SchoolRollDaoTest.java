package com.jhxx.schoolroll.junit.dao;


import com.jhxx.schoolroll.SchoolrollApplicationTests;
import com.jhxx.schoolroll.dao.SchoolRollDao;
import com.jhxx.schoolroll.model.SchoolRoll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SchoolRollDaoTest extends SchoolrollApplicationTests {
    @Autowired
    private SchoolRollDao schoolRollDao;

    @Test
    public void testQuery(){
        List<SchoolRoll> list=schoolRollDao.query();
        System.out.println(list.size());
    }


    @Test
    public void testSave(){
        SchoolRoll schoolRoll=new SchoolRoll();
        schoolRoll.setIdNumber("45123123123132");
        schoolRoll.setSchoolNumber("142132132");
        schoolRoll.setName("张三");
        schoolRoll.setSex(1);
        schoolRollDao.save(schoolRoll);
    }
}
