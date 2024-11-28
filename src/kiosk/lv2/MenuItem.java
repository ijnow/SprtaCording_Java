package kiosk.lv2;

public class MenuItem {

    //`MenuItem` 클래스 생성하기**
    //설명 : 개별 음식 항목을 관리하는 클래스입니다. 현재는 햄버거만 관리합니다.
    //클래스는 `이름`, `가격`, `설명` 필드를 갖습니다.

    String menu;
    double price;
    String description;

    public MenuItem(String menu, double price, String description) {
        this.menu = menu;
        this.price = price;
        this.description = description;
    }
}

