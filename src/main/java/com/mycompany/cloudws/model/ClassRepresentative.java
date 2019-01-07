package com.mycompany.cloudws.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 */
@Entity
@Table(
    name = "class_representatives",
    uniqueConstraints={@UniqueConstraint(columnNames ={"rollNumber", "batch_id", "department_id"})})
public class ClassRepresentative implements Serializable {

  /**
   *
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", updatable = false, nullable = false)
  private int crId;

  /**
   * Name of the CR
   */
  @Column(nullable = false)
  private String name;

  /**
   * Name of the batch
   */
  @Column(nullable = false)
  private String rollNumber;

  /**
   *
   */
  @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
  @JoinColumn(name = "batch_id", nullable = false)
  private Batch batch;

  /**
   *
   */
  @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
  @JoinColumn(name = "department_id", nullable = false)
  private Department department;

  public ClassRepresentative(int crId, String name, String rollNumber) {
    super();
    this.crId = crId;
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public int getCrId() {
    return crId;
  }

  public void setCrId(int crId) {
    this.crId = crId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRollNumber() {
    return rollNumber;
  }

  public void setRollNumber(String rollNumber) {
    this.rollNumber = rollNumber;
  }

  public Batch getBatch() {
    return batch;
  }

  public void setBatch(Batch batch) {
    this.batch = batch;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  @Override
  public String toString() {
    return "ClassRepresentative{" +
        "crId=" + crId +
        ", name='" + name + '\'' +
        ", rollNumber='" + rollNumber + '\'' +
        ", batch_id=" + batch.getBatchId() +
        ", department_id=" + department.getDepartmentId() +
        '}';
  }
}
