package popo2;



class Complex {
    double real, imag;

    
    Complex(double r, double i) {
        this.real = r;
        this.imag = i;
    }

   
    Complex operate(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

   
    Complex operate(Complex other, boolean flag) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

  
    Complex operate(Complex other, int flag) {
        return new Complex(this.real * other.real - this.imag * other.imag,
                           this.real * other.imag + this.imag * other.real);
    }

   
    Complex operate(Complex other, float flag) {
        double denominator = other.real * other.real + other.imag * other.imag;
        double realPart = (this.real * other.real + this.imag * other.imag) / denominator;
        double imagPart = (this.imag * other.real - this.real * other.imag) / denominator;
        return new Complex(realPart, imagPart);
    }

   
    void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5); // First complex number
        Complex c2 = new Complex(2, 3); // Second complex number

        // Perform addition
        Complex sum = c1.operate(c2);
        System.out.print("Sum: ");
        sum.display();

        // Perform subtraction
        Complex diff = c1.operate(c2, true);
        System.out.print("Difference: ");
        diff.display();

        // Perform multiplication
        Complex product = c1.operate(c2, 1);
        System.out.print("Product: ");
        product.display();

        // Perform division
        Complex quotient = c1.operate(c2, 1.0f);
        System.out.print("Quotient: ");
        quotient.display();
    }
}
