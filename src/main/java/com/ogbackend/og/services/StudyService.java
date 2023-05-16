package com.ogbackend.og.services;

import com.ogbackend.og.models.Study;
import com.ogbackend.og.repositories.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudyService {

    @Autowired
    private StudyRepository studyRepository;

    public ArrayList<Study> getStudies (){
        return (ArrayList<Study>) this.studyRepository.findAll();
    }

    public Study nuevoStudy(Study study){
        return this.studyRepository.save(study);
    }

    public ResponseEntity<Object> deleteStudy(Integer id){
        boolean exists = this.studyRepository.existsById(id);
        if(!exists){
            return new ResponseEntity<>(
                    HttpStatus.NOT_FOUND
            );
        }
        this.studyRepository.deleteById(id);
        return new ResponseEntity<>(
                HttpStatus.ACCEPTED
        );
    }
}
