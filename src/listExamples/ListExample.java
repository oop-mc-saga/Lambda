package listExamples;

import common.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tadaki
 */
public class ListExample {

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
        //Add all instances to a list
        List<Student> studentList = new ArrayList<>();
        for (Student s : students) {
            studentList.add(s);
        }
        //Insert an instance at a specified position
        studentList.set(3, new Student("Sam", 8, 80));
        
        //Find a specified element and remove it
        Student ss = students[3];
        studentList.remove(ss);
        
        //Print all elements
        for(Student s :studentList){
            System.out.println(s);
        }
    }

}
