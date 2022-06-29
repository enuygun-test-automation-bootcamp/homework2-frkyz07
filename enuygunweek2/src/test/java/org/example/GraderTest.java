package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    char operation;

    @Test
    void fortyOneShouldReturnF() {
        var grader = new Grader();
        operation = grader.letterGradeDefiner(41);
        assertEquals('F', operation);
        System.out.println(operation);
    }

    @Test
    void fiftyNineShouldReturnD() {
        var grader = new Grader();
        operation = grader.letterGradeDefiner(59);
        assertEquals('D', operation);
        System.out.println(operation);

    }

    @Test
    void sixtyOneShouldReturnC() {
        var grader = new Grader();
        operation = grader.letterGradeDefiner(61);
        assertEquals('C',operation );
        System.out.println(operation);
    }

    @Test
    void seventyOneShouldReturnB() {
        var grader = new Grader();
        operation = grader.letterGradeDefiner(71);
        assertEquals('B', grader.letterGradeDefiner(71));
        System.out.println(operation);
    }

    @Test
    void eightyOneShouldReturnA() {
        var grader = new Grader();
        operation = grader.letterGradeDefiner(81);
        assertEquals('A', grader.letterGradeDefiner(81));
        System.out.println(operation);
    }

    @Test
    void belowThanZeroShouldReturnError() {
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.letterGradeDefiner(-1);
                });
        System.out.println(IllegalArgumentException.class);
    }

    @Test
    void higherThanZeroShouldReturnError() {
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.letterGradeDefiner(250);
                });

        System.out.println(IllegalArgumentException.class);
    }
}