package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.EnvironmentExposure_Debt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface EnvironmentExposure_DebtRepository extends JpaRepository<EnvironmentExposure_Debt,Long> {
    @Query(value = "SELECT * FROM source_环境披露_上市公司环境负债披露情况表 WHERE SHORTNAME = :name", nativeQuery = true)
    ArrayList<EnvironmentExposure_Debt> findEnvironmentExposure_DebtByName(String name);
}
