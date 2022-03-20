package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.Govern_Capacity;
import com.dlut.citiproject.Bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface UserRepository extends JpaRepository<UserBean,Long> {
    UserBean findUserBeanByName(String name);
    boolean existsByName(String name);
    UserBean getUserBeanByName(String name);


}
