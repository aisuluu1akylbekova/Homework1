package com.company;

public class Main {

    public static void main(String[] args) {
	String myFavoriteWord;
	final int NUM = 27;
	String word = " umbrella";
	myFavoriteWord = NUM + word;
	System.out.println(myFavoriteWord);

	if (NUM < 0) {

	    System.out.println("Вы сохранили отрицательное число");
    }

	else if (NUM > 0){

	    System.out.println("Вы сохранили положительное число");

    }

	else {

		System.out.println("Вы сохранили нуль");

	}

    }
}
