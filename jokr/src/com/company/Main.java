package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // version 1

        ArrayList<String> jokeList = new ArrayList<>();

        jokeList.add ("RandomJoke1");
        jokeList.add ("RandomJoke2");
        jokeList.add ("RandomJoke3");

        int listMax = jokeList.size();

        int rng = (int)Math.round(Math.random() * (listMax -1));

        System.out.println(jokeList.get(rng));

    }
}
