import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StatGrade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Required minimum final exam grade assessment for STAT 2060\n");

        System.out.println("What is your assignment grade in percent?");
        double assignment = s.nextDouble();
        System.out.println("What is your tutorial quiz grade in percent?");
        double quiz = s.nextDouble();
        System.out.println("What is your midterm grade in percent?");
        double midterm = s.nextDouble();



        System.out.println("What letter do you wanna get? " +
                "Stop press 0; A+ press 1; A press 2; A- press 3; B+ press 4; B press 5; B- press 6; C+ press 7; C press 8");
        int letter = s.nextInt();
        int grade = 100;
        while (letter != 0){
            switch (letter) {
                case 1: grade = 90;
                    break;
                case 2: grade = 85;
                    break;
                case 3: grade = 80;
                    break;
                case 4: grade = 77;
                    break;
                case 5: grade = 73;
                    break;
                case 6: grade = 70;
                    break;
                case 7: grade = 65;
                    break;
                case 8: grade = 60;
                    break;
                default: System.out.println("The result will be wrong");
            }

            double[] options = new double[4];
            options[0] = (grade - assignment*0.15 - quiz*0.1 - midterm*0.25)/0.5;
            options[1] = (grade - assignment*0.15 - quiz*0.1 - midterm*0)/0.75;
            options[2] = (grade - assignment*0.15 - quiz*0.1 - midterm*0.15)/0.6;
            options[3] = (grade - assignment*0.2 - quiz*0.2 - midterm*0.1)/0.5;



            double minGrade = 100;
            int bestOption = -1;

            for (int i = 0; i < options.length; i++) {
                System.out.printf("Option %d requires minimum final exam grade %.2f\n", i, options[i]);
                if (options[i] < minGrade) {
                    minGrade = options[i];
                    bestOption = i;
                }
            }

            System.out.printf("\nThe best option is %d, and its required minimum final exam grade is %.2f\n", bestOption, minGrade);
            System.out.println("\nWhat letter do you wanna get? " +
                    "Stop press 0; A+ press 1; A press 2; A- press 3; B+ press 4; B press 5; B- press 6; C+ press 7; C press 8");
            letter = s.nextInt();
        }

    }
}
