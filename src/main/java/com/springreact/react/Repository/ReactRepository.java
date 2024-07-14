package com.springreact.react.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreact.react.Entity.ReactEntity;



public interface ReactRepository extends JpaRepository<ReactEntity, Long>{
    
}
