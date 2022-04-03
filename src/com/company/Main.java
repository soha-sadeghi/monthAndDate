package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        int birthdate = scanner.nextInt();
        int leftOver = 0;
    int leftOver2= 0 ;
        leftOver= birthdate % 100 ;
        leftOver2 =((birthdate % 100000)/100);
        System.out.println("month:"+leftOver);
        System.out.println("year:"+leftOver2);
    }
    }
