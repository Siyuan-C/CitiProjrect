package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.EnvironmentAchievement_Details;
import com.dlut.citiproject.Bean.EnvironmentExposure_Debt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EnvironmentExposure_DebtRepository extends JpaRepository<EnvironmentExposure_Debt,Long> {

    @Query(value = "SELECT * FROM 'source_环境披露_上市公司环境负债披露情况表' WHERE ShortName = :name", nativeQuery = true)
    EnvironmentAchievement_Details findEnvironmentAchievement_DetailsByName(String name);

}
