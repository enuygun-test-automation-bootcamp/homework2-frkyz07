package org.example;

public class Grader {
    public char letterGradeDefiner(int gradePoint) {
        if (gradePoint < 0) {
            throw new IllegalArgumentException("This number is not valid");
        }
        if (gradePoint > 100) {
            throw new IllegalArgumentException("This number is not valid");
        }
        if (gradePoint < 50) {
            return 'F';
            }
        if (gradePoint < 60) {
            return 'D';
            }
        if (gradePoint < 70) {
            return 'C';
            }
        if (gradePoint < 80) {
            return 'B';
            }
        if (gradePoint < 90) {
            return 'A';
            }
        return 0;
    }
}
