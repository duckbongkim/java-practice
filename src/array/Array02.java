package array;

public class Array02 {
    public static void main(String[] args) {
        // 배열 변수 선언
        int[] students;
        // 배열 변수 생성
        students = new int[5];

        // 배열안에 값을 입력
        students[0] = 80;
        students[1] = 60;
        students[2] = 70;
        students[3] = 90;
        students[4] = 50;

        System.out.println("학생1 점수:" + students[0] );
        System.out.println("학생2 점수:" + students[1] );
        System.out.println("학생3 점수:" + students[2] );
        System.out.println("학생4 점수:" + students[3] );
        System.out.println("학생5 점수:" + students[4] );
        System.out.println("학생5 점수:" + students[5] );

//        System.out.println(students);

        int a;
        System.out.println("학생5 점수:" + students[5] );
    }


}
