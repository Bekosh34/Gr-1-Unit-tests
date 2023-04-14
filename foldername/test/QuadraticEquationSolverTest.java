import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationSolverTest {

    @Test
    public void testNoRealRoots() {
        double[] roots = new double[2];
        QuadraticEquationSolver.solve(2, 1, 4, roots);
        assertTrue(Double.isNaN(roots[0]));
        assertTrue(Double.isNaN(roots[1]));
    }

    @Test
    public void testOneRealRoot() {
        double[] roots = new double[2];
        QuadraticEquationSolver.solve(1, -2, 1, roots);
        assertEquals(1.0, roots[0], 1e-6);
        assertEquals(1.0, roots[1], 1e-6);
    }

    @Test
    public void testTwoRealRoots() {
        double[] roots = new double[2];
        QuadraticEquationSolver.solve(1, -5, 6, roots);
        assertEquals(2.0, roots[0], 1e-6);
        assertEquals(3.0, roots[1], 1e-6);
    }
}
