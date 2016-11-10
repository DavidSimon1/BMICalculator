import java.util.Scanner;

/**
 * Created by David Simon on 10.11.2016.
 */
public class BMI {

    public static String Category(double bmi) {
        if (bmi < 16) {
            return "Your category is: Severe Thiness";
        } else if (bmi >= 16 && bmi < 17) {
            return "Your category is: Moderate Thiness";
        } else if (bmi >= 17 && bmi < 18.5) {
            return "Your category is: Mild Thiness";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Your category is: Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Your category is: Overweight";
        } else if (bmi >= 30 && bmi < 35) {
            return "Your category is: Obese Class I";
        } else if (bmi >= 35 && bmi < 40) {
            return "Your category is: Obese Class II";
        } else if (bmi > 40) {

        }
        return "Your category is: Obese Class III";
    }


    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height in meters:");
        height = scanner.nextDouble();

        System.out.println("Enter your weight in kg:");
        weight = scanner.nextDouble();

        bmi = weight / (height * height);
        System.out.println("Your BMI is:" + bmi);

        System.out.println(Category(bmi));


    }
}



