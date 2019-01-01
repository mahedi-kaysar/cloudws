package com.mycompany.cloudws.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "university")
public class University implements Serializable {

  /**
   *
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", updatable = false, nullable = false)
  private int universityId;

  /**
   * Name of the university
   */
  @Column(nullable = false)
  private String name;

  /**
   *
   */
  public University() {}

  /**
   *
   * @param universityId
   * @param name
   */
  public University(int universityId, String name) {
    this.universityId = universityId;
    this.name = name;
  }

  /**
   *
   * @return
   */
  public int getUniversityId() {
    return universityId;
  }

  /**
   *
   * @param universityId
   */
  public void setUniversityId(int universityId) {
    this.universityId = universityId;
  }

  /**
   *
   * @return
   */
  public String getName() {
    return name;
  }

  /**
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "University{" +
        "universityId=" + universityId +
        ", name='" + name + '\'' +
        '}';
  }
}
