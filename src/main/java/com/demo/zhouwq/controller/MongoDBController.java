package com.demo.zhouwq.controller;

import com.demo.zhouwq.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MongoDBController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("/mongo")
    public String find(){
        System.out.println(mongoTemplate);
       //Query query=new Query(Criteria.where("name").is("zhouwq"));
        List<User> userList =  mongoTemplate.findAll(User.class);
       // List<User> list = mongoTemplate.findAll(User.class);
       // System.out.println(list.toString());
       // return list.toString();
        System.out.println(userList);
        return userList.toString();
    }

}
