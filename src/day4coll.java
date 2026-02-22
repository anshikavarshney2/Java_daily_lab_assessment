import java.util.ArrayList;
class Student {

    private String name;
    private String course;
    private int sid;

    public Student(String name, String course, int sid) {
        this.name = name;
        this.course = course;
        this.sid = sid;
    }

    public int getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}


public class day4coll {

    public static void main(String[] args) {

        ArrayList<Student> studentInfo = new ArrayList<Student>();

        studentInfo.add(new Student("Student1", "MCA", 1));
        studentInfo.add(new Student("Student2", "MCA", 2));
        studentInfo.add(new Student("Student3", "MCA", 3));
        studentInfo.add(new Student("Student4", "MCA", 4));
        studentInfo.add(new Student("Student5", "MCA", 5));
        studentInfo.add(new Student("Student6", "MCA", 6));

        System.out.println("Student ID\tName\t\tCourse");

        for (Student s : studentInfo) {
            String result = String.format("%d\t\t%s\t\t%s",
                    s.getSid(),
                    s.getName(),
                    s.getCourse());

            System.out.println(result);
        }
    }
}
