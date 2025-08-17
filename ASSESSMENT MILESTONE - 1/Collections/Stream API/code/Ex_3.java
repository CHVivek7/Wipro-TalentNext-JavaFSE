import java.util.*;
import java.util.stream.Collectors;

class Student {
    int rollNo;
    String name;
    int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", mark=" + mark + "]";
    }
}

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter details for 5 students (rollNo name mark):");
        for (int i = 0; i < 5; i++) {
            int rollNo = sc.nextInt();
            String name = sc.next();
            int mark = sc.nextInt();
            students.add(new Student(rollNo, name, mark));
        }
        long clearedCount = students.stream()
                .filter(s -> s.mark >= 50)
                .count();
        System.out.println("Number of students who cleared the test: " + clearedCount);
    }
}
