// 1. package(패키지) 선언
package com.company;

// 2. import(참조) 선언
import java.lang.String;

// 3. 클래스 선언
public class Member {

    // 4. main 메서드 선언
    public static void main(String[] args) {
        String message = hello(30, "1번 회원");
        System.out.println(message);
        System.out.println(hello(27, "2번 회원"));
    }

    // 5. hello 메서드 선언
    public static String hello(int age, String name) {
        return age + "살" + name + " 님 만나서 반갑습니다!";
    }

}
출처: https://congsong.tistory.com/65 [Let's develop:티스토리]
