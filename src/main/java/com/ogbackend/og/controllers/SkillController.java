package com.ogbackend.og.controllers;

import com.ogbackend.og.models.Skill;
import com.ogbackend.og.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/skill")
public class SkillController {
    private final SkillService skillService;

    @Autowired
    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping
    public ResponseEntity<Object> getSkills(){
        return  this.skillService.getSkills();
    }

    @PostMapping
    public ResponseEntity<Object> createSkill(@RequestBody Skill skill){
        return  this.skillService.createSkill(skill);
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<Object> deleteSkill(@PathVariable("id") Integer id){
        return this.skillService.deleteSkill(id);
    }
}
