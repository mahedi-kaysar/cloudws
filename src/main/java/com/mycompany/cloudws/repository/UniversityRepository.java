package com.mycompany.cloudws.repository;

import com.mycompany.cloudws.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {
}
