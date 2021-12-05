import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args){
        int i = 0;
        ArrayList<student> students = new ArrayList<>();
        students.add(new student(3.87));
        students.add(new student(2.95));
        students.add(new student(4.15));
        students.add(new student(4.56));
        students.add(new student(4.89));
        students.add(new student(5.00));
        students.add(new student(4.17));

        Collections.sort(students, new sorting_students_by_gpa());
        for (student s : students) {
            if (i == 0) System.out.println("первый список");
            System.out.println(s.toString() + " ");
            i++;
        }
        System.out.println("\n");

        ArrayList<student> students1 = new ArrayList<>();
        students1.add(new student(4.87));
        students1.add(new student(2.46));
        students1.add(new student(5.00));
        students1.add(new student(3.45));
        students1.add(new student(4.80));
        students1.add(new student(3.50));
        students1.add(new student(5.00));

        i=0;
        Collections.sort(students1, new sorting_students_by_gpa());
        for (student s1 : students1) {
            if (i == 0) System.out.println("второй список");
            System.out.println(s1.toString() + " ");
            i++;
        }
        System.out.println("\n");

        i=0;
        students.addAll(students1);
        Collections.sort(students, new sorting_students_by_gpa());
        for (student s : students) {
            if (i == 0) System.out.println("объединённый список");
            System.out.println(s.toString() + " ");
            i++;
        }
    }
}