package com.ogbackend.og.services;

import com.ogbackend.og.models.Skill;
import com.ogbackend.og.repositories.ProjectRepository;
import com.ogbackend.og.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillService {

    private SkillRepository skillRepository;

    @Autowired
    public SkillService(SkillRepository skillRepository){
        this.skillRepository  = skillRepository;
    }


    public ResponseEntity<Object> createSkill(Skill skill){
        Skill skillCreated  = this.skillRepository.save(skill);
        return new ResponseEntity<>(
                skillCreated,
                HttpStatus.CREATED
        );
    }

    public ResponseEntity<Object> getSkills(){
        List<Skill> skills = this.skillRepository.findAll();
        return new ResponseEntity<>(
                skills,
                HttpStatus.FOUND
        );
    }

    public ResponseEntity<Object> deleteSkill(Integer id){
        boolean exist = this.skillRepository.existsById(id);

        if(!exist){
            return  new ResponseEntity<>(
                    "Not found skill",
                    HttpStatus.NOT_FOUND
            );
        }
        this.skillRepository.deleteById(id);
        return new ResponseEntity<>(
                HttpStatus.ACCEPTED
        );
    }

}
