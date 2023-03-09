package d0308;

public class MainClass {
    public static void main(String[] args) {
        // 다형성 : 부모의 참조변수로 자식객체를 생성한다
        Hello en = new HelloWorldEn();
        callMethod(en);

        Hello kr = new HelloWorldKr();
        callMethod(kr);
    }

    public static void callMethod(Hello hello){
        hello.sayHello();

    }

}


