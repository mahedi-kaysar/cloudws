package com.mycompany.cloudws.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 */
@Entity
@Table(
    name = "calender_events")
public class CalenderEvent implements Serializable {

  /**
   *
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", updatable = false, nullable = false)
  private int eventId;

  /**
   *
   */
  @Column(nullable = false)
  private String eventType;

  /**
   * Name of the batch
   */
  @Column(nullable = false)
  private String title;

  /**
   * Name of the department
   */
  @Column(nullable = false)
  private Date startDate;


  /**
   * Name of the department
   */
  @Column(nullable = false)
  private Date endDate;

  /**
   *
   */
  @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
  @JoinColumn(name = "university_id", nullable = false)
  private University university;

  public CalenderEvent(int eventId, String eventType, String title, Date startDate, Date endDate) {
    super();
    this.eventId = eventId;
    this.eventType = eventType;
    this.title = title;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  /**
   *
   * @return
   */
  public int getEventId() {
    return eventId;
  }

  /**
   *
   * @param eventId
   */
  public void setEventId(int eventId) {
    this.eventId = eventId;
  }

  /**
   *
   * @return
   */
  public String getEventType() {
    return eventType;
  }

  /**
   *
   * @param eventType
   */
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  /**
   *
   * @return
   */
  public String getTitle() {
    return title;
  }

  /**
   *
   * @param title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   *
   * @return
   */
  public Date getStartDate() {
    return startDate;
  }

  /**
   *
   * @param startDate
   */
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   *
   * @return
   */
  public Date getEndDate() {
    return endDate;
  }

  /**
   *
   * @param endDate
   */
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
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
    return "CalenderEvent{" +
        "eventId=" + eventId +
        ", eventType='" + eventType + '\'' +
        ", title='" + title + '\'' +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", university_id=" + university.getUniversityId() +
        '}';
  }
}
