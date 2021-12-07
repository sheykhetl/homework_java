import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class students {
    student[] students = new student[5];
    int[] IDNumber = new int[5];

    public students() {
        students[0] = new student(2, 4.8, "st1");
        students[1] = new student(1, 4.4, "st2");
        students[2] = new student(5, 4.9, "st3");
        students[3] = new student(3, 3.6, "st4");
        students[4] = new student(4, 3.2, "st5");

    }

    public void searchByName(String fio) {
        int check = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFio() == fio) {
                System.out.println("\nfound: " + students[i].getId() + " " + students[i].getAverage() + " " + students[i].getFio());
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("EXCEPTION: NOT FOUND");
        }
    }

    public void sortByName() {
        sorting_by_name sortingStudentByFIO = new sorting_by_name();
        ArrayList<student> studentArrayList = new ArrayList<student>();
        studentArrayList.addAll(Arrays.asList(students));
        Collections.sort(studentArrayList, sortingStudentByFIO);
        System.out.print("Sorted by name: ");
        for (student s : studentArrayList) {
            System.out.print(s.getFio() + " ");
        }
    }

    public void sortByID() {
        for (int i = 0; i < students.length; i++) {
            IDNumber[i] = students[i].getId();
        }

        for (int i = 0; i < IDNumber.length - 1; i++) {
            for (int j = IDNumber.length - 1; j > i; j--) {
                if (IDNumber[j - 1] > IDNumber[j]) {
                    double tmp = IDNumber[j - 1];
                    IDNumber[j - 1] = IDNumber[j];
                    IDNumber[j] = (int) tmp;
                }
            }
        }
        System.out.print("sorted by id: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(IDNumber[i] + " ");
        }
    }


    public student[] getStudents() {
        return students;
    }

    public void setStudents(student[] students) {
        this.students = students;
    }

    public int[] getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int[] IDNumber) {
        this.IDNumber = IDNumber;
    }


    public static void main(String[] args) {
        students students = new students();
        students.sortByID();
        students.searchByName("st5");
        students.sortByName();
    }
}