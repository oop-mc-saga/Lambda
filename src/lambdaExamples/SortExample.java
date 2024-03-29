package lambdaExamples;

import common.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tadaki
 */
public class SortExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] input = {
            new Student("Tom", 1, 88),
            new Student("Jane", 2, 80),
            new Student("Ray", 3, 70),
            new Student("Kim", 4, 75),
            new Student("Jeff", 5, 85),
            new Student("Ann", 6, 75),
            new Student("Beth", 7, 90)
        };
        List<Student> studentList = new ArrayList<>();
        for (Student s : input) {
            studentList.add(s);
        }
        //Sort data by ascending order of names
        Comparator<Student> comparator
                = (a, b) -> a.name.compareTo(b.name);
        studentList.sort(comparator);

        studentList.forEach(s -> System.out.println(s));
    }

}
