package com.example.vps_game_flatform.DAO;

import com.example.vps_game_flatform.Entity.SysResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResourceRepository extends JpaRepository<SysResource,Integer> {
    @Query("SELECT rs FROM SysResource rs WHERE rs.sys_resource_id = ?1")
    SysResource getBySys_resource_id(int id);
    @Query(value = "SELECT * FROM sys_resource  LIMIT ?1 OFFSET ?2",nativeQuery = true)
    List<SysResource> findAllPage(int limit,int start);
}
