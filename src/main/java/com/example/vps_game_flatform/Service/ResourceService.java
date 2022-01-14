package com.example.vps_game_flatform.Service;

import com.example.vps_game_flatform.Entity.SysResource;

import java.util.List;

public interface ResourceService {
    SysResource getBySys_resource_id(int id);

    List<SysResource> getAll();

    List<SysResource> getAllPagi(int page);
}
