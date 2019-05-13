package com.mileshko.lesya;


import rx.Observable;
import rx.subjects.BehaviorSubject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        //1.RxJava
      /*  BehaviorSubject<Integer> a = BehaviorSubject.create();
        BehaviorSubject<Integer> b = BehaviorSubject.create();
        Observable<Integer> c = Observable.combineLatest(a,b,(i1, i2) -> i1+i2);
        c.subscribe (System.out::println);
        a.onNext(10);
        b.onNext(10);
        a.onNext(20);
        Observable<Integer> cIn2 = c.map(i->i*i);
        cIn2.subscribe (System.out::println);
        a.onNext(1);
        b.onNext(2);
        a.onNext(3);
        Observable<Integer> cEven = c.filter(i->i%2==0);
        cEven.subscribe (System.out::println);
*/
        //2
        URL url = new URL("https://vk.com/mil_lesya");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        System.out.println(connection.getResponseCode());
        System.out.println(connection.getResponseMessage());
        System.out.println(connection.getRequestMethod());


        Map<String, List<String>> myMap = connection.getHeaderFields();
        Set<String> myField = myMap.keySet();
        System.out.println("Далее следует заголовок:");

        // Вывести все ключи и значения из заголовка
        for(String k : myField) {
            System.out.println("Ключ: " + k + " Значение: "
                    + myMap.get(k));
        }


    }
}
