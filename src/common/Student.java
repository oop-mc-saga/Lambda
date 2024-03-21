package common;

import java.util.Objects;

/**
 *
 * @author tadaki
 */
public class Student implements Comparable<Student>{

    final public String name;
    final public int id;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    
}
