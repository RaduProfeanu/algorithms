package homework6;

public class ComplexNumber {

        double real, img;

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

    ComplexNumber(double r, double i){
            this.real = r;
            this.img = i;
        }

        public static ComplexNumber addTwoNumbers(ComplexNumber c1, ComplexNumber c2)
        {

            ComplexNumber temp = new ComplexNumber(0, 0);
            temp.real = c1.real + c2.real;
            temp.img = c1.img + c2.img;
            return temp;
        }

    public static ComplexNumber substractTwoNumbers(ComplexNumber c1, ComplexNumber c2)
    {

        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real - c2.real;
        temp.img = c1.img - c2.img;
        return temp;
    }

    public static void main(String args[]) {
        ComplexNumber c1 = new ComplexNumber(5.5, 4);
        ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
        ComplexNumber temp = addTwoNumbers(c1, c2);
        ComplexNumber temp2 = substractTwoNumbers(c1,c2);
        System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
        System.out.println("Difference is: "+ temp2.real+" + "+ temp2.img +"i");
    }
}

