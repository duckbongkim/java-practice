package array;

public class Array06 {
    public static void main(String[] args) {
        int[] students = {90,80,70,60,50};

        int sum = 0;
        for (int i = 0; i < students.length; i++){
            sum += students[i] ;
        }

        double avg = sum/students.length;
        System.out.println(avg);
    }
}
