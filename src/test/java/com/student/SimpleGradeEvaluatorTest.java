package com.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleGradeEvaluatorTest {

    @Test
    public void testGradeA() {
        SimpleGradeEvaluator evaluator = new SimpleGradeEvaluator();
        assertEquals("A", evaluator.evaluate(95));
    }

    @Test
    public void testGradeB() {
        SimpleGradeEvaluator evaluator = new SimpleGradeEvaluator();
        assertEquals("B", evaluator.evaluate(85));
    }

    @Test
    public void testGradeC() {
        SimpleGradeEvaluator evaluator = new SimpleGradeEvaluator();
        assertEquals("C", evaluator.evaluate(75));
    }

    @Test
    public void testGradeD() {
        SimpleGradeEvaluator evaluator = new SimpleGradeEvaluator();
        assertEquals("D", evaluator.evaluate(65));
    }

    @Test
    public void testGradeF() {
        SimpleGradeEvaluator evaluator = new SimpleGradeEvaluator();
        assertEquals("F", evaluator.evaluate(50));
    }

    @Test
    public void testGradeInvalid() {
        SimpleGradeEvaluator evaluator = new SimpleGradeEvaluator();
        assertEquals("Invalid", evaluator.evaluate(-5));
    }
}