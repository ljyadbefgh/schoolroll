package com.jhxx.schoolroll.web.action.frontdesk;

import com.jhxx.schoolroll.model.SchoolRoll;
import com.jhxx.schoolroll.model.base.Constant;
import com.jhxx.schoolroll.model.base.JsonCode;
import com.jhxx.schoolroll.service.SchoolRollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/frontdesk/ask")
public class SchoolRollController {
    @Autowired
    private SchoolRollService schoolRollService;

    @PostMapping
    public Map<String, Object> doAddCustomer(@RequestBody SchoolRoll schoolRoll){
        Map<String, Object> map=new HashMap<String, Object>();
        schoolRollService.save(schoolRoll);
        map.put(Constant.JSON_CODE, JsonCode.SUCCESS.getValue());
        map.put(Constant.JSON_MESSAGE, "调差表已成功上传");
        return map;
    }
}
