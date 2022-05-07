package com.irostub.designpatterns._06adaptor.ex;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class WorkInJava {
    public static void main(String[] args) {
        //Collection
        //List, Enumeration, List 형의 변수들이 target interface 취급
        //우항의 메서드들은 어댑터
        //인자들은 어댑티에 해당
        List<String> strings = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(strings);
        List<String> list = Collections.list(enumeration);

        //file
        //각 스트림과 리더들의 변형
        try (InputStream is = new FileInputStream("myfile.txt");
             InputStreamReader inputStreamReader = new InputStreamReader(is);
             BufferedReader inputStream = new BufferedReader(inputStreamReader)) {
            if (inputStream.ready()) {
                System.out.println(inputStream.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
