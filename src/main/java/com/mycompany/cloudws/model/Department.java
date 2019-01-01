package com.mycompany.cloudws.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 */
@Entity
@Table(
    name = "departments",
    uniqueConstraints={@UniqueConstraint(columnNames ={"departmentName", "university_id"})})
public class Department implements Serializable {

  /**
   *
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", updatable = false, nullable = false)
  private int departmentId;

  /**
   * Name of the department
   */
  @Column(nullable = false)
  private String departmentName;

  /**
   *
   */
  @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
  @JoinColumn(name = "university_id", nullable = false)
  private University university;

  /**
   *
   */
  public Department() {}

  /**
   *
   * @param departmentId
   * @param departmentName
   */
  public Department(int departmentId, String departmentName) {
    this.departmentId = departmentId;
    this.departmentName = departmentName;
  }

  /**
   *
   * @return
   */
  public int getDepartmentId() {
    return departmentId;
  }

  /**
   *
   * @param departmentId
   */
  public void setDepartmentId(int departmentId) {
    this.departmentId = departmentId;
  }

  /**
   *
   * @return
   */
  public String getDepartmentName() {
    return departmentName;
  }

  /**
   *
   * @param departmentName
   */
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
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
    return "Department{" +
        "departmentId=" + departmentId +
        ", departmentName='" + departmentName + '\'' +
        ", universityId=" + university.getUniversityId() +
        '}';
  }
}
