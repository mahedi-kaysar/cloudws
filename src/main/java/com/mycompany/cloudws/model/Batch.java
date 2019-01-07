package com.mycompany.cloudws.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 */
@Entity
@Table(
    name = "batches",
    uniqueConstraints={@UniqueConstraint(columnNames ={"name", "university_id"})})
public class Batch implements Serializable {

  /**
   *
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", updatable = false, nullable = false)
  private int batchId;

  /**
   * Name of the batch
   */
  @Column(nullable = false)
  private String name;

  /**
   * Name of the department
   */
  @Column(nullable = false)
  private String level;


  /**
   * Name of the department
   */
  @Column(nullable = false)
  private String term;

  /**
   *
   */
  @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
  @JoinColumn(name = "university_id", nullable = false)
  private University university;

  /**
   *
   * @param batchId
   * @param name
   * @param level
   * @param term
   */
  public Batch(int batchId, String name, String level, String term) {
    super();
    this.batchId = batchId;
    this.name = name;
    this.level = level;
    this.term = term;
  }

  /**
   *
   * @return
   */
  public int getBatchId() {
    return batchId;
  }

  /**
   *
   * @param batchId
   */
  public void setBatchId(int batchId) {
    this.batchId = batchId;
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

  /**
   *
   * @return
   */
  public String getLevel() {
    return level;
  }

  /**
   *
   * @param level
   */
  public void setLevel(String level) {
    this.level = level;
  }

  /**
   *
   * @return
   */
  public String getTerm() {
    return term;
  }

  /**
   *
   * @param term
   */
  public void setTerm(String term) {
    this.term = term;
  }

  /**
   *
   * @return
   */
  public University getUniversity() {
    return university;
  }

  /**
   *
   * @param university
   */
  public void setUniversity(University university) {
    this.university = university;
  }

  @Override
  public String toString() {
    return "Batch{" +
        "batchId=" + batchId +
        ", name='" + name + '\'' +
        ", level='" + level + '\'' +
        ", term='" + term + '\'' +
        ", university_id=" + university.getUniversityId() +
        '}';
  }
}
