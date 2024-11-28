package com.example.kiosk.lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //`Kiosk` 클래스 생성하기**
    //설명**: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
    //`MenuItem`을 관리하는 리스트가 필드로 존재합니다.
    List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }


    // `main` 함수에서 관리하던 입력과 반복문 로직은 이제 `start` 함수를 만들어 관리합니다.
    //`List<MenuItem> menuItems` 는 `Kiosk` 클래스 생성자를 통해 값을 할당합니다.
    //`Kiosk` 객체를 생성하고 사용하는 `main` 함수에서 객체를 생성할 때 값을 넘겨줍니다.
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).menu + " | " + menuItems.get(i).price + " | " + menuItems.get(i).description);
        }

        //+
        //유효하지 않은 입력에 대해 오류 메시지를 출력합니다.
        //`0`을 입력하면 프로그램이 ‘뒤로가기’되거나 ‘종료’됩니다.
        while (true) {
            System.out.print("숫자를 입력해주세요: ");
            int number = scanner.nextInt();

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

                //유효하지 않은 입력에 대해 오류 메시지를 출력합니다.
                default:
                    System.out.println("유효하지 않은 번호입니다.");
            }
        }
    }


}
