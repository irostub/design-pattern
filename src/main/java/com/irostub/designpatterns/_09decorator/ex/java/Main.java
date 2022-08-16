package com.irostub.designpatterns._09decorator.ex.java;

import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Book());

        List list1 = Collections.checkedList(list, Book.class);
        list1.add(new Book());
        list1.add(new Item()); //에러 발생!

        //CheckedList 객체가 한번 더 감싸서 필터 역할을 함

        List list2 = Collections.unmodifiableList(list);
        list2.add(new Book()); //불변으로 정의됨! UnmodifiableList 객체가 감싸고있음

        //이 둘도 http 의 요청을 래퍼클래스로 한번 감싸서 처리하고있음!
        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }

    static class Book {

    }

    static class Item{

    }
}
