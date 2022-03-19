package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.Govern_Capacity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface Govern_CapacityRepository extends JpaRepository<Govern_Capacity,Long> {

    @Query(value = "SELECT * FROM source_管理层治理能力 WHERE short_name = :name", nativeQuery = true)
    ArrayList<Govern_Capacity> findGovern_CapacityByName(@Param("name")String name);
}
