package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.Govern_Capacity;
import com.dlut.citiproject.Bean.SocialResponsibility_Index;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

//ByName0：安全生产内容；ByName1：客户及消费者权益保护；ByName2：公共关系和社会公益事业
public interface SocialResponsibility_IndexRepository extends JpaRepository<SocialResponsibility_Index,Long> {

    @Query(value = "SELECT * FROM source_上市公司社会责任评价指标表 WHERE content_type = '安全生产内容' AND short_name = :name", nativeQuery = true)
    ArrayList<SocialResponsibility_Index> findSocialResponsibility_IndexByName0(@Param("name")String name);

    @Query(value = "SELECT * FROM source_上市公司社会责任评价指标表 WHERE content_type = '客户及消费者权益保护' AND short_name = :name", nativeQuery = true)
    ArrayList<SocialResponsibility_Index> findSocialResponsibility_IndexByName1(@Param("name")String name);

    @Query(value = "SELECT * FROM source_上市公司社会责任评价指标表 WHERE content_type = '公共关系和社会公益事业' AND short_name = :name", nativeQuery = true)
    ArrayList<SocialResponsibility_Index> findSocialResponsibility_IndexByName2(@Param("name")String name);

}
