package com.ani.crud.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.ani.crud.domain.User;

public interface UserRepository extends MongoRepository <User, Long> {
    
}
