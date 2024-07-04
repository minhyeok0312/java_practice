// 1. import(참조) 선언
import java.lang.String;

// 2. 클래스 선언
public class Member {

    // 3. main 메서드 선언
    public static void main(String[] args) {
        String message = hello(30, "1번 회원");
        System.out.println(message);
        System.out.println(hello(27, "2번 회원"));
    }

    // 4. hello 메서드 선언
    public static String hello(int age, String name) {
        return age + "살" + name + " 님 만나서 반갑습니다!";
    }

}
