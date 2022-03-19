package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.Risk_Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface Risk_LevelRepository extends JpaRepository<Risk_Level,Long> {

    @Query(value = "SELECT * FROM source_风险水平 WHERE STKCD = (SELECT STKCD FROM level WHERE ShortName = :name)", nativeQuery = true)
    ArrayList<Risk_Level> findRisk_LevelByName(@Param("name")String name);
}
