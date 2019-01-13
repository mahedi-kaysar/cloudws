package com.mycompany.cloudws.controller;

import com.mycompany.cloudws.model.University;
import com.mycompany.cloudws.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("universities")
public class UniversityController {
  Logger logger = Logger.getLogger(this.getClass().getName());

  @Autowired
  private UniversityService universityService;

  @GetMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<List<University>> getAllUniversities() {
    logger.info("Get a list of university.");
    HttpStatus httpStatus;
    List<University> universities = this.universityService.getAllUniversities();
    logger.info("universities=" + universities);
    if (universities == null) {
      httpStatus = HttpStatus.BAD_REQUEST;
    }
    else {
      httpStatus = HttpStatus.OK;
    }

    return new ResponseEntity<>(universities, httpStatus);
  }
}
