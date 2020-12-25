package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByUserName(String userName);
    User findByPassWord(String passWord);
    User findUserById(Integer id);
    @Transactional
    void deleteById(Integer id);
}
