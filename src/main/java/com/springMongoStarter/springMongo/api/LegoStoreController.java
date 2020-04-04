package com.springMongoStarter.springMongo.api;

import com.springMongoStarter.springMongo.model.LegoSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("legostore/api")
public class LegoStoreController {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public LegoStoreController(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @PostMapping("/save")
    public void insert(@RequestBody LegoSet legoset) {
        System.out.println(legoset);
        this.mongoTemplate.insert(legoset);
    }

    @GetMapping("/all")
    public List<LegoSet> all() {
        return this.mongoTemplate.findAll(LegoSet.class);
    }
}
