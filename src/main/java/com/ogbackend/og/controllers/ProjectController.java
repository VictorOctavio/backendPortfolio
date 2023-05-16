package com.ogbackend.og.controllers;

import com.ogbackend.og.models.Project;
import com.ogbackend.og.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/project")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getProjects(){
        return  this.projectService.getProjects();
    }

    @PostMapping
    public ResponseEntity<Object> saveProject(@RequestBody Project project){
        return this.projectService.saveProject(project);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Object> deleteProject(@PathVariable("id") Integer id){
        return  this.projectService.deleteProject(id);
    }
}

