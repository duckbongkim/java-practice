package calss1;

public class class03 {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name ="학생1";
        student1.age=15;
        student1.grade = 50;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 20;
        student2.grade=20;

//        Student[] students = new Student[2];
//        students[0] = student1;
//        students[1] = student2;

        Student[] students = {student1,student2};

        /*
        for(int i = 0; i<students.length; i++){
            System.out.println("이름: "+students[i].name);
        }
        */

        for(Student s : students){
            System.out.println("이름: "+s.name);
        }

//        System.out.println("이름: "+students[0].name);
//       System.out.println("이름: "+students[1].name);

    }
}
