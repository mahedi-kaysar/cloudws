package com.mycompany.cloudws.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 */
@Entity
@Table(
    name = "attendees",
    uniqueConstraints={@UniqueConstraint(columnNames ={"event_id", "batch_id"})})
public class Attendee implements Serializable {

  /**
   *
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", updatable = false, nullable = false)
  private int attendeeId;

  /**
   *
   */
  @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
  @JoinColumn(name = "event_id", nullable = false)
  private CalenderEvent calenderEvent;

  /**
   *
   */
  @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
  @JoinColumn(name = "batch_id", nullable = false)
  private Batch batch;

  public Attendee(int attendeeId) {
    super();
    this.attendeeId = attendeeId;
  }

  public int getAttendeeId() {
    return attendeeId;
  }

  public void setAttendeeId(int attendeeId) {
    this.attendeeId = attendeeId;
  }

  public CalenderEvent getCalenderEvent() {
    return calenderEvent;
  }

  public void setCalenderEvent(CalenderEvent calenderEvent) {
    this.calenderEvent = calenderEvent;
  }

  public Batch getBatch() {
    return batch;
  }

  public void setBatch(Batch batch) {
    this.batch = batch;
  }

  @Override
  public String toString() {
    return "Attendee{" +
        "attendeeId=" + attendeeId +
        ", event_id=" + calenderEvent.getEventId() +
        ", batch_id=" + batch.getBatchId() +
        '}';
  }
}
