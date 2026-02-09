import java.util.ArrayList;

public class GradeBook {
    private Course course;
    private ArrayList<Student> students = new ArrayList<>();

    public GradeBook(Course course) {
        this.course = course;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course);
    }

    public void displayGradeReport() {
        int sum = 0;
        int min = 100;
        int max = 0;

        for (Student s : students) {
            int g = s.getGrade();
            sum += g;
            if (g < min) min = g;
            if (g > max) max = g;
        }

        System.out.println("Average: " + (double) sum / students.size());
        System.out.println("Lowest: " + min);
        System.out.println("Highest: " + max);
    }
}
