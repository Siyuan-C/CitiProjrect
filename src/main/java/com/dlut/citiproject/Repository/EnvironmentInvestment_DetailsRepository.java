package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.EnvironmentInvestment_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface EnvironmentInvestment_DetailsRepository extends JpaRepository<EnvironmentInvestment_Details,Long> {
    @Query(value = "SELECT * FROM source_环境投资_上市公司环境投资明细表 WHERE SHORTNAME = :name", nativeQuery = true)
    ArrayList<EnvironmentInvestment_Details> findEnvironmentInvestment_DetailsByName(String name);
}
