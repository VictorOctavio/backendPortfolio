package com.ogbackend.og.repositories;

import com.ogbackend.og.models.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends JpaRepository<Study, Integer> {
}
