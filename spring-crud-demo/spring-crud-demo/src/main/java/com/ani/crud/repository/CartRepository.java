package com.ani.crud.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<cart, Long> {
    
}
