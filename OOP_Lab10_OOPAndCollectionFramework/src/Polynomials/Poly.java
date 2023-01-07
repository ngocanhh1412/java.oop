package Polynomials;

public interface Poly {
    int degree();
    Poly derivative();
    double[] coefficients();
    double coefficient(int degree);
}
