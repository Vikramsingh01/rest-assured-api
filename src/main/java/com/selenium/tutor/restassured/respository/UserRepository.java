package com.selenium.tutor.restassured.respository;

import com.selenium.tutor.restassured.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer>, PagingAndSortingRepository<UserInfo, Integer> {

}
