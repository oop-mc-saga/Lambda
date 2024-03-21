package collectionsExamples;

import common.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tadaki
 */
public class ProtectionBySynchronization {

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
        List<Student> studentList = 
                Collections.synchronizedList(new ArrayList<>());
        //Add all instances to a list
        for (Student s : students) {
            studentList.add(s);
        }
    }
    
}
