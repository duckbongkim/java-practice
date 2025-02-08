package calss1.construct;

public class OverLoading {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member("홍길동",20,200);

        member1.showInfo();
        member2.showInfo();
    }
}
