package calss1.construct;

public class ConstructorMain {
    public static void main(String[] args) {
        MemberInit2 member1 = new MemberInit2("학생1",20,200);
        MemberInit2 member2 = new MemberInit2("학생2",20,300);

        MemberInit2[] members = {member1,member2};


        for(MemberInit2 m : members){
            System.out.println("이름: "+m.name);
        }
    }
}
