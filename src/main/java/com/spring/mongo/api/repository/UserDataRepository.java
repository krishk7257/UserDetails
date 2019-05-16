package com.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.UserData;

public interface UserDataRepository extends MongoRepository<UserData, Integer> {

}
