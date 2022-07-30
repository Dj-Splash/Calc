package com.stanislav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println( "Консольный калькулятор целых чисел\n" +
                "Допустимые числа для ввода от 1 до 10 и от I до X(включительно)" +
                "\nВозможные математические операции: + - * /" );
        Scanner in = new Scanner(System.in);
        try{
            System.out.println(com.stanislav.Calculator.calc(in.nextLine()) );
        }catch (com.stanislav.InputException e){
            System.err.println(e.getMessage());
        }
    }

}
