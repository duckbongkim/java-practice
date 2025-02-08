package calss1.encapsulation;

public class MaxCount {
    private int count = 0;
    private int max;

public MaxCount(int max){
    this.max = max;
}

public void increment(){
    if(count >= max){
        System.out.println("최대값 도달: "+max);
        return;
    }else {
        count++;
        System.out.println("최대값 미도달 1증가, 현재 count: "+count);
    }
}

public void getCount(){
    System.out.println(count);
}

}
