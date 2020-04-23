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

        //要素を探す
        int k = Collections.binarySearch(studentList, input[3]);
        System.out.println(input[3] + " is found at " + k);

        //最大の要素を見つける
        Student best = Collections.max(studentList);
        System.out.println(best + " marks the best");

        //整列
        System.out.println("sorted list");
        Collections.sort(studentList);
        studentList.forEach(
                s -> System.out.println(s)
        );
        System.out.println("----------------");
        //配列へ出力
        Student[] studentArray = new Student[studentList.size()];
        studentArray = studentList.toArray(studentArray);
        for(Student s:studentArray){
            System.out.println(s);
        }
        System.out.println("----------------");
        
        //変更不可のビューを作る
        List<Student> view = Collections.unmodifiableList(studentList);
        try {
            Collections.reverse(view);
        } catch (UnsupportedOperationException e) {
            System.err.println("このリストは変更できない");
        }
    }

}
