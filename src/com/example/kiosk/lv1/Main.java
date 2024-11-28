package com.example.kiosk.lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[ SHAKESHACK MENU ]");


        while (true) {
            System.out.print("햄버거 메뉴를 입력해주세요: ");
            String menu = scanner.nextLine();
            switch (menu) {
                case "ShackBurger":
                    System.out.println(menu + " | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                    break;
                case "SmokeShack":
                    System.out.println(menu + " | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                    break;
                case "Cheeseburger":
                    System.out.println(menu + " | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                    break;
                case "Hamburger":
                    System.out.println(menu + " | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                    break;
                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}
