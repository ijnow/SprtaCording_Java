package kiosk.lv4;

import kiosk.lv3.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    //설명 : MenuItem 클래스를 관리하는 클래스입니다.
    //예를 들어, 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 `MenuItem`을 포함합니다.
    // `List<MenuItem>` 은 `Kiosk` 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경합니다.

    //여러 버거들을 포함하는 상위 개념 ‘버거’ 같은 `카테고리 이름` 필드를 갖습니다.
    private String category;
    List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Menu(String category){
        this.category=category;
        this.menuItems=new ArrayList<>();
    }

    //메뉴 카테고리 이름을 반환하는 메서드가 구현되어야 합니다.

    // MenuItem 클래스를 List로 관리

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    // List를 리턴하는 함수

    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
}
