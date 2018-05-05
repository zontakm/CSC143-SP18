package csc143.listadtclient1;

import java.util.Objects;

import csc143.listadtv1.List;

/**
 * Represents a student in a class.
 */
public class Student {
  private Integer studentId;
  private List grades;

  public Student(Integer studentId, List grades) {
    this.studentId = studentId;
    this.grades = grades;
  }


  /**
   * Getter for property 'studentId'.
   *
   * @return Value for property 'studentId'.
   */
  public Integer getStudentId() {
    return studentId;
  }

  /**
   * Getter for property 'grades'.
   *
   * @return Value for property 'grades'.
   */
  public List getGrades() {
    return grades;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null || getClass() != other.getClass()) return false;
    Student student = (Student) other;
    return Objects.equals(studentId, student.studentId)
        && Objects.equals(grades, student.grades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentId, grades);
  }

  @Override
  public String toString() {
    return "Student{"
        + "studentId=" + studentId
        + ", grades=" + grades
        + '}';
  }


}
