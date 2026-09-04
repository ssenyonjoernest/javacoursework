/*
PSEUDOCODE

START

Read first test score
Read second test score
Read third test score

Calculate average:
average = (score1 + score2 + score3) / 3

Check whether average is below 50:
needsRetake = average < 50

Display the average
Display the needsRetake value

END
*/

import java.util.Scanner;

public class Retakechecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the three test scores
        System.out.print("Enter first test score: ");
        double score1 = input.nextDouble();

        System.out.print("Enter second test score: ");
        double score2 = input.nextDouble();

        System.out.print("Enter third test score: ");
        double score3 = input.nextDouble();

        // Calculate average
        double average = (score1 + score2 + score3) / 3;

        // Check whether a retake is needed
        boolean needsRetake = average < 50;

        // Display results
        System.out.println("Average: " + average);
        System.out.println("Needs retake: " + needsRetake);

        input.close();
    }
}