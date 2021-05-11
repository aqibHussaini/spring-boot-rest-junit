//package com.example.app.service;
//
//import com.example.app.entity.User;
//import com.example.app.repository.userReopository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//@Service
//public class userService {
//    @Autowired
//    userReopository userReopository;
//
//    public User save(User user) {
//        return this.userReopository.save(user);
//    }
//    public User updateUser(User user,long id) {
//        User  obj=this.userReopository.findById(id).get();
//        obj.setName(user.getName());
//        obj.setEmail(user.getEmail());
//        obj.setPassword(user.getPassword());
//        obj.setPicture(user.getPicture());
//        return this.userReopository.save(user);
//    }
//
//
//    public void deleteUser(Long id) {
//        this.userReopository.delete(this.userReopository.findById(id).get());
//    }
//
//    public Page<User> getUsers(Pageable pageable) {
//        return this.userReopository.findAll(pageable);
//    }
//
//    public User getUser(Long id) {
//        return this.userReopository.findById(id).get();
//    }
//}
//
