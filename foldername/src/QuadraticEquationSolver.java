public class QuadraticEquationSolver {
    
    public static void solve(double a, double b, double c, double[] roots) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            roots[0] = Double.NaN;
            roots[1] = Double.NaN;
        } else if (delta == 0) {
            roots[0] = -b / (2 * a);
            roots[1] = roots[0];
        } else {
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
        }
    }
}
