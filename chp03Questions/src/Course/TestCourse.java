package Course;

public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("Java Programming");

        course.addStudent("Alice");
        course.addStudent("Bob");
        course.addStudent("Charlie");

        System.out.println("Students after adding:");
        printStudents(course);

        course.dropStudent("Bob");

        System.out.println("\nStudents after dropping Bob:");
        printStudents(course);

        course.clear();

        System.out.println("\nStudents after clearing the course:");
        printStudents(course);
    }

    public static void printStudents(Course course) {
        String[] students = course.getStudents();
        if (students.length == 0) {
            System.out.println("No students enrolled.");
        } else {
            for (String student : students) {
                System.out.println(student);
            }
        }
    }
}
