class Student{
    int roll;
    String name;
    int marks;
}
public class Enhanced_for_loop {
    public static void main(String[] args) {
        
    
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    s1.name = "Ram";
    s2.name = "Shyam";
    s3.name = "Mohan";
    s1.marks = 56;
    s2.marks = 67;
    s3.marks = 60;

    Student stu[ ] = new Student[3];
    stu[0]=s1;
    stu[1]=s2;
    stu[2]=s3;

    for(Student n : stu)
    {
        System.out.println(n.name+ " : " +n.marks);
    }
    }
}
