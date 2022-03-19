package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.EnvironmentAchievement_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface EnvironmentAchievement_DetailsRepository extends JpaRepository<EnvironmentAchievement_Details,Long> {

//    @Query(value = "SELECT stkcd, EndDate, InstitutionID,ShortName, PerfProjectName, PerfValue,Unit FROM source_环境绩效_上市公司环境绩效明细表 WHERE SHORTNAME = :name", nativeQuery = true)
    @Query(value = "SELECT * FROM source_环境绩效_上市公司环境绩效明细表 WHERE short_name = :name", nativeQuery = true)
    ArrayList<EnvironmentAchievement_Details> findEnvironmentAchievement_DetailsByName(@Param("name")String name);
}
