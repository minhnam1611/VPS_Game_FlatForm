package com.example.vps_game_flatform.Service;

import com.example.vps_game_flatform.DAO.ResourceRepository;
import com.example.vps_game_flatform.Entity.SysResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceIplm implements ResourceService {
    @Autowired
    private ResourceRepository Repo_resource;

    public static final int LIMIT = 2;

    @Override
    public SysResource getBySys_resource_id(int id) {
        return Repo_resource.getBySys_resource_id(id);
    }

    @Override
    public List<SysResource> getAll() {
        return Repo_resource.findAll();
    }


    @Override
    public List<SysResource> getAllPagi(int page) {
        int size = getAll().size();
        //int totalPage = size/LIMIT;
        int start = (page-1)*LIMIT+1;
        return Repo_resource.findAllPage(LIMIT,start);
    }
}
