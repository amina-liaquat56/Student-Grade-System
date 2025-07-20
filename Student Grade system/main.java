import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                //  student info
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter roll number: ");
        String rollNo = input.nextLine();

                    // Subjects
        System.out.print("Enter number of subjects: ");
        int numSubjects = input.nextInt();

        int[] marks = new int[numSubjects];
        int total = 0;

                   // Get marks
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            total += marks[i];
        }

                 // Calculate average
        double average = (double) total / numSubjects;

                   // Determine grade
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        // Display result
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + total + "/" + (numSubjects * 100));
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        input.close();
    }
}


