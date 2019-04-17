package com.demo.zhouwq.controller;

import com.demo.zhouwq.entity.User;
import com.demo.zhouwq.eums.StatusCode;
import com.demo.zhouwq.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * springboot整个mongoDB
 */
@RestController
public class MongoDBController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("/mongo")
    public BaseResponse find(){
        System.out.println(mongoTemplate);
       //Query query=new Query(Criteria.where("name").is("zhouwq"));
        List<User> userList =  mongoTemplate.findAll(User.class);
       // List<User> list = mongoTemplate.findAll(User.class);
       // System.out.println(list.toString());
       // return list.toString();
        BaseResponse<List<User>> br = new BaseResponse(StatusCode.Success, userList);
        System.out.println(userList);
        return br;
    }

}
