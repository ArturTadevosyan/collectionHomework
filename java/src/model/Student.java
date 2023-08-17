package src.model;

public class Student implements Comparable<Student> {
    private String name;
    private int mark;

    public Student(String str) {
        String[] split = str.split("-");
        name = split[0];
        mark = Integer.parseInt(split[1]);
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return name + " " + mark;
    }


    @Override
    public int compareTo(Student o) {
        return this.mark - o.getMark();
    }
}
