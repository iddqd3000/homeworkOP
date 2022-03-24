import java.util.Arrays;


public class MyPolynomial {
    private double[] coeffs;


    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }


    public String toString() {
        if (coeffs.length == 1) {
            return Double.toString(coeffs[0]);
        }
        String result = "";
        for (int i = coeffs.length - 1; i > 0; --i) {
            if (i == 1) {
                result += Double.toString(coeffs[i]) + "x" + "+";
                continue;
            }
            result += Double.toString(coeffs[i]) + "x^" + Integer.toString(i) + "+";


        }
        return result += Double.toString(coeffs[0]);
    }


    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        double max[]=right.getDegree()>this.getDegree()?right.coeffs:this.coeffs;
        double min[]=right.getDegree()>this.getDegree()?this.coeffs:right.coeffs;
        double array[] = new double[max.length];
        for(int i = 0;i<min.length;i++){
            array[i] = this.coeffs[i]+right.coeffs[i];
        }
        for(int i = min.length;i<max.length;i++){
            array[i]= max[i];
        }
        return new MyPolynomial(array);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int newArrayDegree = right.getDegree() + this.getDegree();
        double array[] = new double[newArrayDegree];
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                array[i + j] += right.coeffs[j] * this.coeffs[i];

            }
        }
        return new MyPolynomial(array);
    }
}

