package com.ogbackend.og.controllers;

import com.ogbackend.og.models.Study;
import com.ogbackend.og.models.UserModel;
import com.ogbackend.og.services.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/study")
public class StudyController {
    @Autowired
    StudyService studyService;

    @GetMapping()
    public ArrayList<Study> getStudies(){
        return this.studyService.getStudies();
    }

    @PostMapping
    public Study nuevoStudy(@RequestBody Study study){
        return this.studyService.nuevoStudy(study);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Object> deleteStudy(@PathVariable("id") Integer id){
        return  this.studyService.deleteStudy(id);
    }
}
