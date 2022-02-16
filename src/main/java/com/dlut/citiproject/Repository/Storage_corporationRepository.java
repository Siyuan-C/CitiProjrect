package com.dlut.citiproject.Repository;

import com.dlut.citiproject.Bean.Storage_corporation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Storage_corporationRepository extends JpaRepository<Storage_corporation,Long> {
    Storage_corporation getStorage_corporationByName(String name);
    boolean existsByName(String name);
}