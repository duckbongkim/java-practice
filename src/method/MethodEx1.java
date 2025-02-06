package method;

public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println("평균값 : "+avg(1,2,3));
        System.out.println("평균값 : "+avg(14,25,3));

    }
    public static double avg(double a, double b, double c){
        double sum = a + b + c;
        return sum / 3.0;
  }
}
