package com.lyc.apidemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        Runtime r =  Runtime.getRuntime();

        System.out.println(r.availableProcessors());
        System.out.println(r.maxMemory()/1024/1024);
        System.out.println(r.freeMemory()/1024/1024);
        System.out.println(r.totalMemory()/1024/1024);
        r.exec("python");

    }

}
