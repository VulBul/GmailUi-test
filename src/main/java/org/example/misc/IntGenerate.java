package org.example.misc;


import java.util.Random;

public class IntGenerate {
    public int getRandomNumber() {

        Random r = new Random();
        int x = r.nextInt(900000) + 100000;
        return x;
    }

}
