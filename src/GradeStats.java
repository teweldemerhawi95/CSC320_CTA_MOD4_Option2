import java.util.Scanner;

public class GradeStats {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] gradesList = new float[10];
        float enteredGrade = 0;
        float averageGrade, maximumGrade, minimumGrade, gradesSum;
        averageGrade = 0;
        maximumGrade = 0;
        minimumGrade = 0;
        gradesSum = 0;

// Adding grades from the user into an array.

        for(int i = 0; i < gradesList.length; i++) {
            System.out.println("Please enter a grade: ");
            enteredGrade = input.nextFloat();
            gradesList[i] = enteredGrade;
        }

// Calculating the average.

        for(float grade : gradesList) {
            gradesSum += grade;
        }
        averageGrade = (gradesSum / gradesList.length);
        System.out.println("");
        System.out.println("Average grade: " + averageGrade);

// Calculating the maximum.

        maximumGrade = gradesList[0];

        for(int i = 1; i < gradesList.length; i++) {
            if(gradesList[i] >= maximumGrade) {
                maximumGrade = gradesList[i];
            }
        }
        System.out.println("Maximum grade: " + maximumGrade);

// Calculating the minimum.

        minimumGrade = gradesList[0];

        for(int i = 1; i < gradesList.length; i++) {
            if(gradesList[i] <= minimumGrade) {
                minimumGrade = gradesList[i];
            }
        }
        System.out.println("Minimum grade: " + minimumGrade);
    }
}
