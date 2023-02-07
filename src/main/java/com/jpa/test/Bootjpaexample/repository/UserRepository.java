package com.jpa.test.Bootjpaexample.repository;

import com.jpa.test.Bootjpaexample.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
