package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private ArrayList<Integer> intList = new ArrayList<Integer>();

    public int calculate(int first, int second, char calculate) {
        int result = 0;
        switch (calculate) {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                if (second == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = first / second;
                }
                break;
        }
        intList.add(result);
        return result;
    }

    public List<Integer> getintList() {
        return new ArrayList<Integer>(intList);
    }

    /*
    public void removeResult() {
        }
    */
}


