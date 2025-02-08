package calss1.construct;

public class MethodInitMain01 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("학생",20,200);

        MemberInit member2 = new MemberInit();
        member2.initMember("학생2",20,300);

        MemberInit[] members = {member1,member2};
        for(MemberInit m : members){
            System.out.println("이름: "+m.name);
        }
    }
}
