import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double height = getInputNumber();
        double width = getInputNumber();

        System.out.println("Area is: " + (height*width));

    }

    public static double getInputNumber() {
        double n;
        
        Scanner nhapPhim = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = nhapPhim.nextDouble();
        
        return n;
    }
}

