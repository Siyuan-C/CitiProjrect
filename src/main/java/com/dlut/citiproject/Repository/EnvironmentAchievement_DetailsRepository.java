package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.EnvironmentAchievement_Details;
import com.dlut.citiproject.Bean.LevelBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EnvironmentAchievement_DetailsRepository extends JpaRepository<EnvironmentAchievement_Details,Long> {

    @Query(value = "SELECT * FROM 'source_环境绩效_上市公司环境绩效明细表' WHERE ShortName = :name", nativeQuery = true)
    EnvironmentAchievement_Details findEnvironmentAchievement_DetailsByName(String name);

}
