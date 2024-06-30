class ComplexNumbers {
    double real;
    double imaginary;

    public ComplexNumbers(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    ComplexNumbers add(ComplexNumbers other){
         return new ComplexNumbers(this.real+other.real, this.imaginary+other.imaginary);
    }

    void show(){
        System.out.println(real+"+" + imaginary + "i");
    }
}

public class Main {
    public static void main(String[] args){
        ComplexNumbers num1=new ComplexNumbers(3.5, 5.5);
        ComplexNumbers num2=new ComplexNumbers(2.0,3.0);

        ComplexNumbers sum=num1.add(num2);

        num1.show();
        num2.show();
        System.out.println("Sum: ");
        sum.show();
    }

}
