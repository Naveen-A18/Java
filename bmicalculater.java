import java.util.*;

public class bmicalculater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.println("Enter height (m): ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is : %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category : Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category : Normal weight");
        } 
        else if (bmi >= 25 && bmi < 30) {
            System.out.println("Category : Overweight");
        } 
        else {
            System.out.println("Category : Obese");
        }

        sc.close();
    }
}