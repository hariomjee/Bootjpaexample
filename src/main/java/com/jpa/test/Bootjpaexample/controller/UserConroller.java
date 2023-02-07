package com.jpa.test.Bootjpaexample.controller;


import com.jpa.test.Bootjpaexample.model.User;
import com.jpa.test.Bootjpaexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserConroller {
    @Autowired
    UserService userService;
    @GetMapping("/user")
    //creating a get mapping that retrieves all the books detail from the database

    private List<User>getAllUser(){
        return userService.getAllUser();
    }

    //creating a get mapping that retrieves the detail of a particular user
    @GetMapping("/user/{userid}")
    private User getUser(@PathVariable("userid") int userid)
    {
        return userService.getUserById(userid);
    }

    //creating a delete mapping that deletes a specified user
    @DeleteMapping("/user/{userid}")
    private void deleteBook(@PathVariable("userid") int userid)
    {
        userService.delete(userid);
    }

    //creating put mapping that updates the user detail and make another data
    @PutMapping("/user/{userid}")
    private User update(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user;
    }

    //creating post mapping that post the book detail in the database
    @PostMapping("/user")
    private int saveUser(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user.getId(); // there  may be here error.
    }


}
