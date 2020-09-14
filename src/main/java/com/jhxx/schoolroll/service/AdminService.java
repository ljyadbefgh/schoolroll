package com.jhxx.schoolroll.service;

import com.jhxx.schoolroll.dao.AdminDao;
import com.jhxx.schoolroll.exception.MyWebException;
import com.jhxx.schoolroll.model.Admin;
import com.jhxx.schoolroll.util.SHA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;

    /**
     * 登录方法
     *
     * @param username 账户名，不能为空
     * @param password 密码，不能为空
     * @return null表示登录失败
     */
    public boolean login(String username, String password){
        boolean judge=false;
        if(StringUtils.isEmpty(username)){
            throw new MyWebException("登陆失败：账户名不能为空");
        }else  if(StringUtils.isEmpty(password)){
            throw new MyWebException("登陆失败：密码不能为空");
        }else{
            if(adminDao.login(username, SHA.getResult(password))==1){
                judge=true;
            }
        }
        return judge;
    }

    public Admin get(String username){
        if(StringUtils.isEmpty(username)) {
            throw new MyWebException("操作失败：账户名不能为空");
        }
        Admin admin=adminDao.get(username);
        return admin;
    }
}
