package com.example;

import com.library.randomgenerator.RandomGenerator;

public class Test {
    public static void main(String[] args) {
        String nickname = RandomGenerator.getCharterNickname("말파이트");
        System.out.println("nickname = " + nickname);
    }
}
