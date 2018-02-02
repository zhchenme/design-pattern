package com.jas.decorator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        
        int c = 0;
        InputStream in = null;

        try {
            //设置FileInputStream ,先用BufferedInputStream 装饰它，再用LowerCaseInputStream 进行装饰
            in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")));
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 输出
     * hello world
     */
}
