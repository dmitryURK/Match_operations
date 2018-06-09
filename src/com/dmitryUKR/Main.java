package com.dmitryUKR;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanNum = new Scanner(System.in);
	    int ifirst, isecond, iresult;
	    System.out.print("Введите первое число>");
	    ifirst = scanNum.nextInt();
	    System.out.print("Введите второе число>");
	    isecond = scanNum.nextInt();
	    iresult = ifirst + isecond;
	    System.out.println("результат: "+iresult);
	    iresult /=2;
	    System.out.println("результат / 2: "+iresult);

    }
}
