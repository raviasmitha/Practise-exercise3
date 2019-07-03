package com.stackroute.exercise3;


public class StudentMarks {

  // checking student marks

  public String check(int stuGrades[], int numOfStudents) {
    for (int i = 0; i < numOfStudents; i++)

      if (stuGrades[i] < 0 || stuGrades[i] > 100) { // checking the marks is between 0 and 100
        return "Error"; // no return error
      }

    return "All marks are correct"; // else return correct
  }
}

