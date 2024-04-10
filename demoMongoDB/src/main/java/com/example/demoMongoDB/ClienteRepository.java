package com.example.demoMongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository <Cliente, String> {

}
