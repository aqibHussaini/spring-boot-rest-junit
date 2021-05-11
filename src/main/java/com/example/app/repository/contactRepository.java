package com.example.app.repository;

import com.example.app.entity.Contact;
import com.example.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface contactRepository extends JpaRepository<Contact,Long> {
    List<Contact> findByUser(User user);
    @Query(value = "SELECT * FROM `contact` WHERE user_id =1",nativeQuery = true)
    List<Contact> findContacts();
//    @Query(value = "select * from contact where user_id=?",nativeQuery = true)
//    List<Contact> findUser(@Param("user_id") Long user_id);
}
