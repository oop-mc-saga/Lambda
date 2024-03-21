package dequeExample;

import common.Student;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author tadaki
 */
public class DequeExample {

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

        boolean isQueue = false;
        Deque<Student> deque = new ArrayDeque<>();
        for (Student s : students) {
            deque.offer(s);
        }

        if (isQueue) {//Queue example
            while (!deque.isEmpty()) {
                Student s = deque.removeFirst();
                System.out.println(s);
            }
        } else {//Stack example
            while (!deque.isEmpty()) {
                Student s = deque.removeLast();
                System.out.println(s);
            }
        }
    }

}
