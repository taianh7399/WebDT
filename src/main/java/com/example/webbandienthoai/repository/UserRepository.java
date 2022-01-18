package com.example.webbandienthoai.repository;

import com.example.webbandienthoai.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    UserEntity findByUsername(String username);
    @Query(value ="select name from  user where id = :id ",nativeQuery = true)
    List<UserEntity> getUserEntityById(@Param(value = "id") Integer id);
}
