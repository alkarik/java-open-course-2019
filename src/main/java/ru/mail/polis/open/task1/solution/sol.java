package ru.mail.polis.open.task1.solution;

import ru.mail.polis.open.task1.FizzBuzz;

public class sol implements FizzBuzz {
    @Override
    public void print(int from, int to) {
        for (int i=from; i<=to;i++){
            System.out.println(getWorld(i));
        }
    }

    private String getWorld(int i) {
        if(i % 3 == 0) { return "Fizz";}
        if(i % 5 == 0) { return "Buzz";}
        if(i % 15 == 0){ return "FizzBuzz";}
        return Integer.toString(i);
    }

    public static void main(String[] args) {
        new sol().print(1,100);
    }
}

