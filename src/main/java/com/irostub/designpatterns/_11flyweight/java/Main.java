package com.irostub.designpatterns._11flyweight.java;

public class Main {
    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf(100);
        Integer integer2 = Integer.valueOf(100);

        System.out.println(integer1 == integer2);

        //Integer 내부에서 -128~127 까지 캐싱되고 있다.
        //그래서 재밋는 점은 == 비교할 때 위의 범위를 넘어간 수를 불러오면 참조가 같이 않기에 false 가 나온다.
        //아래의 테스트

        Integer integer3 = Integer.valueOf(10204);
        Integer integer4 = Integer.valueOf(10204);

        System.out.println(integer3==integer4);
        System.out.println(integer3.equals(integer4));
    }
}
