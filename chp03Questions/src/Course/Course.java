package Course;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;


    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[5]; // Başlangıçta 5 kapasiteli
        numberOfStudents = 0;
    }


    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            expandArray();
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }


    private void expandArray() {
        String[] newStudents = new String[students.length * 2];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        students = newStudents;
    }


    public void dropStudent(String student) {
        int index = -1;
        // Find the index
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
        }
    }


    public void clear() {
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {

        String[] currentStudents = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            currentStudents[i] = students[i];
        }
        return currentStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
