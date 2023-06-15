import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Adilzhan", "Samigulov", 22);
        Student s1 = new Student("Sergey", "Ivanov", 23, (long)101);
        Student s2 = new Student("Alexander", "Kotov", 21, (long)102);
        Student s3 = new Student("Oleg", "Smailov", 22, (long)103);
        Student s4 = new Student("Vitaliy", "Musatov", 23, (long)104);
        
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        StudentGroup group = new StudentGroup(null);

        for(Student stud : group)
        {
            System.out.println(stud);
        }
        
        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);
    }
}