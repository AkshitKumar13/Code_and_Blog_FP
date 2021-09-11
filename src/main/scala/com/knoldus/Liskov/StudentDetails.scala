package com.knoldus.Liskov

case class StudentDetails(student: Student) {
  def getStudentName():String= student.name
  def getStudentAge():Int= student.age
  def getStudentCourse():String= student.course

}