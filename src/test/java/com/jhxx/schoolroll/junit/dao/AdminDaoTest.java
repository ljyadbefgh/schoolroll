package com.jhxx.schoolroll.junit.dao;

import com.jhxx.schoolroll.SchoolrollApplicationTests;
import com.jhxx.schoolroll.dao.AdminDao;
import com.jhxx.schoolroll.model.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminDaoTest extends SchoolrollApplicationTests {
    @Autowired
    private AdminDao adminDao;

    @Test
    public void testQueryAdmins(){
        List<Admin> list=adminDao.query();
        for(Admin admin:list){
            System.out.println(admin.getUsername());
        }
    }

    @Test
    public void testLogin(){
        System.out.println(adminDao.login("jhxx","fh58q2ea6thauof5ikg98fe2ciafh50r"));
    }

    @Test
    public void test(){
        System.out.println(adminDao.totals("admin"));
    }
}
