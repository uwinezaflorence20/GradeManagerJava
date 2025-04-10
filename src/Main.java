import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GradeManager gm = new GradeManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎓 Welcome to Grade Manager!");
        System.out.print("How many grades would you like to enter? ");
        int numberOfGrades = scanner.nextInt();

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade #" + (i + 1) + ": ");
            int grade = scanner.nextInt();
            try {
                gm.addGrade(grade);
            } catch (IllegalArgumentException e) {
                System.out.println(" Invalid grade: " + e.getMessage());
                i--; // let user retry
            } finally {
                System.out.println("Tried to add grade: " + grade);
            }
        }

        System.out.println("\n Displaying all grades:");
        gm.displayGrades();

        System.out.print("\n Enter a grade to remove: ");
        int gradeToRemove = scanner.nextInt();
        gm.removeGrade(gradeToRemove);

        System.out.print("\n Enter index of grade to update: ");
        int index = scanner.nextInt();
        System.out.print("Enter new grade: ");
        int newGrade = scanner.nextInt();
        gm.updateGrade(index, newGrade);

        System.out.println("\n Updated grade list:");
        gm.displayGrades();

        System.out.println();
        gm.sortGrades();

        System.out.print("\n Enter a grade to search for: ");
        int searchGrade = scanner.nextInt();
        gm.searchGrade(searchGrade);

        gm.calculateAverage();
        gm.highestAndLowest();

        scanner.close();
    }
}
