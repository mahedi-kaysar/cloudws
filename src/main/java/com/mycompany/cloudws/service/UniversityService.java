package com.mycompany.cloudws.service;

import com.mycompany.cloudws.model.University;
import com.mycompany.cloudws.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 */
@Service
public class UniversityService {

  /**
   *
   */
  @Autowired
  private UniversityRepository universityRepository;

  /**
   *
   * @return
   */
  public List<University> getAllUniversities() {
    return this.universityRepository.findAll();
  }

  public University getUniversity(int id) {
    Optional<University> universityOptional = this.universityRepository.findById(id);
    return universityOptional.isPresent() ? universityOptional.get() : null;
  }
}
