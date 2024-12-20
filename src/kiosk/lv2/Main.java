package kiosk.lv2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        List<MenuItem> menuItems = new ArrayList<MenuItem>();

        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));


        // Scanner 선언
        Scanner scanner = new Scanner(System.in);

        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i+1) + ". " + menuItems.get(i).menu + " | " + menuItems.get(i).price + " | " + menuItems.get(i).description);
        }


        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        while (true) {
            /*
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i+1) + ". " + menuItems.get(i).menu + " | " + menuItems.get(i).price + " | " + menuItems.get(i).description);
            }

             */


            // 숫자를 입력 받기
            System.out.print("숫자를 입력해주세요: ");
            int number = scanner.nextInt();


            // 입력된 숫자에 따른 처리
            // 프로그램을 종료
            // 선택한 메뉴 : 이름, 가격, 설명

            switch (number) {
                case 1:
                    System.out.println(number + " | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                    break;
                case 2:
                    System.out.println(number + " | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                    break;
                case 3:
                    System.out.println(number + " | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                    break;
                case 4:
                    System.out.println(number + " | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;

            }
        }
    }
}
