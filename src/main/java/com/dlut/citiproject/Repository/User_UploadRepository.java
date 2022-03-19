package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.User_Upload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface User_UploadRepository extends JpaRepository<User_Upload,Long> {

    @Query(value = "SELECT * FROM 企业上传信息表 WHERE SHORTNAME = :name", nativeQuery = true)
    ArrayList<User_Upload> findUser_UploadBy_Name(String name);

}
