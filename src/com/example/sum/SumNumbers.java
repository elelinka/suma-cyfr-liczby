package com.example.sum;

public class SumNumbers {

    public static int sumOfNumbers(int number) {
        int result = 0;

        while (number != 0) {
            result += number % 10;
            number = number / 10;
        }
        return result;
    }
}
