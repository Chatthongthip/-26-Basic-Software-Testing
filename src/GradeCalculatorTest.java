import static org.junit.Assert.*;
import org.junit.Test;

public class GradeCalculatorTest {

    @Test
    public void testGradeA_Boundary80And100() {
        GradeCalculator calc = new GradeCalculator();
        assertEquals("A", calc.gradeOf(80));
        assertEquals("A", calc.gradeOf(100));
    }

    @Test
    public void testGradeBPlusAndF_Boundaries() {
        GradeCalculator calc = new GradeCalculator();
        assertEquals("B+", calc.gradeOf(79));
        assertEquals("F", calc.gradeOf(49));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testScoreBelowZeroThrowsException() {
        GradeCalculator calc = new GradeCalculator();
        calc.gradeOf(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testScoreAboveHundredThrowsException() {
        GradeCalculator calc = new GradeCalculator();
        calc.gradeOf(101);
    }
}