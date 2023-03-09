package d0307;

import java.util.Date;

public class Strong_Week_DI {
    public static void main(String[] args) {
        Date date=new Date(); // 강한결합
        System.out.println("date1 : " + date);
    }

    public static void Date(Date d) {
        Date d2 = d; // 약한결합
        System.out.println("date1 : " + d2);
    }

    public static void MemberUse1(){
        Member m1 = new Member(); // 강한결합
    }

    public static void MemberUse2(Member m){
        Member m2 = m; // 약한결합 // 느슨하다
    }
}

class Member{
    String name;
    String nickName;
    public Member(){};
}