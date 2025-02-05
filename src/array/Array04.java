package array;

public class Array04 {
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

        //변수의 값을 사용
        for (int i=0; i < students.length; i++){
            System.out.println("학생"+(i+1)+" 점수: "+ students[i]);
        }
    }
}
