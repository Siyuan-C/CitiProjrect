package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.Corporate_Upload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface Corporate_UploadRepository extends JpaRepository<Corporate_Upload,Long> {

    @Query(value = "SELECT * FROM 企业上传信息表 WHERE SHORTNAME = :name", nativeQuery = true)
    ArrayList<Corporate_Upload> findCorporate_UploadByName(String name);
}
