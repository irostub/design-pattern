package com.irostub.designpatterns._05prototype.ex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        //list.clone() List 인터페이스에는 없다

        List<Student> clone = new ArrayList<>(list);
        //ArrayList 는 Cloneable 을 구현하고 있고, 생성자로 복사를 지원하므로
        //생성자를 통해 clone 한다.
    }
}
