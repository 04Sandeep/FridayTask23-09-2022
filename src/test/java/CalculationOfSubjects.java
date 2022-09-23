import java.util.Scanner;

public class CalculationOfSubjects {
    public void inputvalue(float eng, float phy, float chem, float math, float comp) {
        Scanner op = new Scanner(System.in);
        System.out.println("Enter marks of five subjects:");
        System.out.print("Enter marks of English subjects:");
        eng = op.nextFloat();
        System.out.print("Enter marks of physics subjects:");
        phy = op.nextFloat();
        System.out.print("Enter marks of chemistry subjects:");
        chem = op.nextFloat();
        System.out.print("Enter marks of maths subjects:");
        math = op.nextFloat();
        System.out.print("Enter marks of computers subjects:");
        comp = op.nextFloat();
    }

    public void calcualteaverage(double total, double average, double percentage) {
        float eng, phy, chem, math, comp;
        total = eng + phy + chem + math + comp;
        average = (total / 5.0);
        percentage = (total / 500.0) * 100;

    }

    public void display(double total, double average, double percentage) {
        System.out.println("Total marks =" + total);
        System.out.println("Average marks = " + average);
        System.out.println("Percentage = " + percentage);
    }

        public static void main(String args[])
        {
            CalculationOfSubjects cs = new CalculationOfSubjects();
            cs.inputvalue();
            cs.calcualteaverage();
            cs.display();
        }
    }

