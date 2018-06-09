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
	    System.out.println("результат сложения: "+iresult);
		iresult = ifirst - isecond;
		System.out.println("результат вычетания: "+iresult);
		iresult /=2;
	    System.out.println("результат / 2: "+iresult);
	    iresult = ifirst * isecond;
	    System.out.println("результат умножения первого числа на второе: "+iresult);
		iresult = ifirst / isecond;
		System.out.println("результат деления первого числа на второе: "+iresult);
		iresult = ifirst % isecond;
		System.out.println("остаток от деления первого числа на второе: "+iresult);

	}
}
