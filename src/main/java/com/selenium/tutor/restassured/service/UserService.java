package com.selenium.tutor.restassured.service;

import com.selenium.tutor.restassured.model.UserInfo;
import com.selenium.tutor.restassured.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Page<UserInfo> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public UserInfo saveUser(UserInfo user) {
        return userRepository.save(user);
    }

    public UserInfo getUserById(Integer id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public void updateUser(Integer id, UserInfo userInfo) {
        UserInfo dbUserInfo = getUserById(id);
        dbUserInfo.setFirstName(userInfo.getFirstName());
        dbUserInfo.setLastName(userInfo.getLastName());
        dbUserInfo.setDateOfBirth(userInfo.getDateOfBirth());
        userRepository.save(dbUserInfo);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
