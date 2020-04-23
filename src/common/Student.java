package common;

/**
 *
 * @author tadaki
 */
public class Student implements Comparable<Student>{

    final public String name;//名前
    final public int id;//番号
    protected int record;

    public Student(String name, int id, int record) {
        this.name = name;
        this.id = id;
        this.record = record;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return String.valueOf(id) + ":"+name +":"+ String.valueOf(record);
    }

    @Override
    public int compareTo(Student o) {
        int difference = this.record- o.record;
        if(difference==0){
            return name.compareTo(o.name);
        }
        return difference;
    }

}
