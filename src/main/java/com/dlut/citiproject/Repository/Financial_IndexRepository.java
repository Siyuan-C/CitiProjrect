package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.Financial_Index;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface Financial_IndexRepository extends JpaRepository<Financial_Index,Long> {

    @Query(value = "SELECT * FROM source_财务指标 WHERE short_name = :name", nativeQuery = true)
    ArrayList<Financial_Index> findFinancial_IndexByName(@Param("name")String name);
}
