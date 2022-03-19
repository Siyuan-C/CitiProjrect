package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.Login_UserBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Login_UserBeanRepository extends JpaRepository<Login_UserBean,Long> {
    Login_UserBean getLogin_UserBeanByName(String name);
    boolean existsByName(String name);
}