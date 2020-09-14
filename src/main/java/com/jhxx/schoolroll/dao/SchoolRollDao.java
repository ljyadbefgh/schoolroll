package com.jhxx.schoolroll.dao;


import com.jhxx.schoolroll.model.SchoolRoll;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//为了不让idea报错加上
public interface SchoolRollDao{

    @Select("SELECT * FROM school_roll")
    List<SchoolRoll> query();

    /**
     * 保存数据
     * @param schoolRoll
     * @return
     */
    int save(SchoolRoll schoolRoll);
}
