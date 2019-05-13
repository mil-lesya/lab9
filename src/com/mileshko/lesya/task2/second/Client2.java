package com.mileshko.lesya.task2.second;


public class Client2 {

    public static String ipAddr = "localhost";
    public static int port = 8080;

    public static void main(String[] args) {
        new ClientSomthing(ipAddr, port);
    }
}
