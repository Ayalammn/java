public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("OOP");
        GradeBook gb = new GradeBook(course);

        gb.addStudent(new Student("A", 85));
        gb.addStudent(new Student("B", 90));
        gb.addStudent(new Student("C", 78));

        gb.displayMessage();
        gb.displayGradeReport();
    }
}
