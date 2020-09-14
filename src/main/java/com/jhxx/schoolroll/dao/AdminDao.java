package com.jhxx.schoolroll.dao;


import com.jhxx.schoolroll.base.BaseDAO;
import com.jhxx.schoolroll.model.Admin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//为了不让idea报错加上
public interface  AdminDao extends BaseDAO {

    @Select("SELECT * FROM admin where username=#{username}")
    Admin get(String username);

    @Select("SELECT * FROM admin")
    List<Admin> query();

    @Select("SELECT count(1) FROM admin where username=#{username} and password=#{password}")
    int login(String username, String password);
}
