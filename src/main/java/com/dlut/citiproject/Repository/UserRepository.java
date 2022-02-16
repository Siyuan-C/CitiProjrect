package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserBean,Long> {
    UserBean findUserBeanByName(String name);
    boolean existsByName(String name);
}
