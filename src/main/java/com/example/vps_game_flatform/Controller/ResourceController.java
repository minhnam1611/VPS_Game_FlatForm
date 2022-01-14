package com.example.vps_game_flatform.Controller;

import com.example.vps_game_flatform.Entity.ReponseObject;
import com.example.vps_game_flatform.Entity.SysResource;
import com.example.vps_game_flatform.Service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @GetMapping("/list-resource")
    public ReponseObject getAllResource(@RequestParam(defaultValue = "1") int id){

        List<SysResource> list =  resourceService.getAllPagi(id);
        return new ReponseObject(ReponseObject.SUCCESS, list,"Success");

    }
}
