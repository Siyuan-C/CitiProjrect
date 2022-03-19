package com.dlut.citiproject.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dlut.citiproject.Bean.LevelBean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface LevelRepository extends JpaRepository<LevelBean,Long>{
    @Query(value = "SELECT ShortName FROM level WHERE ShortName like %:name%",nativeQuery = true)
    ArrayList<String> findLevelByName(@Param("name")String name);
    @Query(value = "SELECT * FROM level WHERE ShortName like %:name%",nativeQuery = true)
    LevelBean findLevelByName1(@Param("name")String name);
}
