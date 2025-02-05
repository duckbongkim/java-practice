package array;

public class Array07 {
    public static void main(String[] args) {
        int[] students = {90,80,70,60,50};

        int maxValue = 0;
        for (int i = 0; i < students.length; i++){
            if (students[i] > maxValue){
                maxValue = students[i];
            }
        }
        System.out.println(maxValue);
    }
}
