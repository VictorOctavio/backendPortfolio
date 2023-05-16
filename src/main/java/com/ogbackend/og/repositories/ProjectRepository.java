package com.ogbackend.og.repositories;

import com.ogbackend.og.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository  extends JpaRepository<Project, Integer> {
}