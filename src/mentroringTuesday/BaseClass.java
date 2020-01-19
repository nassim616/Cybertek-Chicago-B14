package mentroringTuesday;

import java.util.ArrayList;

public class BaseClass {
    public static void main(String[] args) {


        student student1 = new student();
        student1.firstName = "nassim";
        student1.lastName = "iou";
        student1.age = 21;
        student1.isActive = true;

        student student2 = new student();
        student2.firstName = "nassim";
        student2.lastName = "iou";
        student2.age = 41;
        student2.isActive = false;


        student student3 = new student();
        student3.firstName = "nassim";
        student3.lastName = "iou";
        student3.age = 34;
        student3.isActive = true;

        ArrayList<student> students  = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for(student student: students)
            if (student.isActive)
                System.out.println(student.info() + "/n");
    }
}
