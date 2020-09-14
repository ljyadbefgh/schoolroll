package com.jhxx.schoolroll.junit.service;

import com.jhxx.schoolroll.SchoolrollApplicationTests;
import com.jhxx.schoolroll.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceTest extends SchoolrollApplicationTests {
    @Autowired
    private AdminService adminService;

    @Test
    public void testLogin(){
        System.out.println(adminService.login("jhxx","6675"));
    }
}
