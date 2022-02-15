package CollectionsSamples;

import common.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tadaki
 */
public class ListSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] students = {
            new Student("Tom", 1, 88),
            new Student("Jane", 2, 80),
            new Student("Ray", 3, 70),
            new Student("Kim", 4, 75),
            new Student("Jeff", 5, 85),
            new Student("Ann", 6, 75),
            new Student("Beth", 7, 90)
        };
        List<Student> studentList = new ArrayList<>();
        for (Student s : students) {
            studentList.add(s);
        }

        //Search element in list
        int k = Collections.binarySearch(studentList, students[3]);
        System.out.println(students[3] + " is found at " + k);

        //Find the maximum element
        Student best = Collections.max(studentList);
        System.out.println(best + " marks the best");

        //Sort list
        System.out.println("sorted list");
        Collections.sort(studentList);
        studentList.forEach(
                s -> System.out.println(s)
        );
        System.out.println("----------------");
        //Copy list to array
        Student[] studentArray = new Student[studentList.size()];
        studentArray = studentList.toArray(studentArray);
        for (Student s : studentArray) {
            System.out.println(s);
        }
        System.out.println("----------------");

        //Create immutable view of list
        List<Student> view = Collections.unmodifiableList(studentList);
        try {
            Collections.reverse(view);
        } catch (UnsupportedOperationException e) {
            System.err.println("This list is immutable.");
        }
    }

}
