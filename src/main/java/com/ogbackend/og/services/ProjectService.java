package com.ogbackend.og.services;


import com.ogbackend.og.models.Project;
import com.ogbackend.og.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }

    public List<Project> getProjects(){
        return this.projectRepository.findAll();
    }
    public ResponseEntity<Object> saveProject(Project project){
        Project projectResponse = this.projectRepository.save(project);
        return new ResponseEntity<>(
                projectResponse,
                HttpStatus.CREATED
        );
    }
    public ResponseEntity<Object> deleteProject(Integer id){
        boolean exists = this.projectRepository.existsById(id);
        if(!exists){
            return new ResponseEntity<>(
                    HttpStatus.NOT_FOUND
            );
        }
        this.projectRepository.deleteById(id);
        return new ResponseEntity<>(
                HttpStatus.ACCEPTED
        );
    }

}
