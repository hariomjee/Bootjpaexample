package com.jpa.test.Bootjpaexample.service;

import com.jpa.test.Bootjpaexample.model.User;
import com.jpa.test.Bootjpaexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    //getting all user record by using the method findaAll() of CrudRepository
    public List<User> getAllUser()
    {
        List<User> user = new ArrayList<User>();
        userRepository.findAll().forEach(user1-> user.add(user1));
        return user;
    }

    //getting a specific record by using the method findById() of CrudRepository
    public User getUserById(int id)
    {
        return userRepository.findById(id).get();
    }


    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(User books)
    {
        userRepository.save(books);
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        userRepository.deleteById(id);
    }

    //updating a record
    public void update(User user, int userid)
    {
        userRepository.save(user);
    }


}
