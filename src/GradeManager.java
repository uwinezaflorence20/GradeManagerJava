import java.util.ArrayList;
import java.util.Collections;

public class GradeManager {
    private ArrayList<Integer> grades;

    public GradeManager() {
        grades = new ArrayList<>();
    }

    // Add a grade
    public void addGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        grades.add(grade);
        System.out.println("Grade added: " + grade);
    }

    // Display all grades
    public void displayGrades() {
        if (grades.isEmpty()) {
            System.out.println("No grades added yet.");
        } else {
            System.out.println("All grades: " + grades);
        }
    }

    // Sort grades
    public void sortGrades() {
        Collections.sort(grades);
        System.out.println("Sorted grades: " + grades);
    }

    // Search for a grade
    public void searchGrade(int grade) {
        int index = grades.indexOf(grade);
        if (index != -1) {
            System.out.println("Grade " + grade + " found at index " + index);
        } else {
            System.out.println("Grade " + grade + " not found.");
        }
    }

    // Calculate average
    public void calculateAverage() {
        if (grades.isEmpty()) {
            System.out.println("No grades to calculate.");
            return;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        double average = (double) sum / grades.size();
        System.out.println("Average grade: " + average);
    }

    // Highest and lowest
    public void highestAndLowest() {
        if (grades.isEmpty()) {
            System.out.println("No grades to check.");
            return;
        }

        int highest = Collections.max(grades);
        int lowest = Collections.min(grades);

        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }

    // Remove grade by value
    public void removeGrade(int grade) {
        if (grades.remove(Integer.valueOf(grade))) {
            System.out.println("Removed grade: " + grade);
        } else {
            System.out.println("Grade " + grade + " not found, so it wasn't removed.");
        }
    }

    // Update grade at a given index
    public void updateGrade(int index, int newGrade) {
        if (index < 0 || index >= grades.size()) {
            System.out.println("Invalid index.");
            return;
        }
        if (newGrade < 0 || newGrade > 100) {
            System.out.println("Invalid grade. Must be between 0 and 100.");
            return;
        }

        int oldGrade = grades.get(index);
        grades.set(index, newGrade);
        System.out.println("Updated grade at index " + index + " from " + oldGrade + " to " + newGrade);
    }
}
