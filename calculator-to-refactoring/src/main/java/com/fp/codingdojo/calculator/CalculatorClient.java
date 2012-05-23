package com.fp.codingdojo.calculator;

import java.util.LinkedList;
import java.util.List;

public class CalculatorClient {

	public static void main(String[] args) {
		bla(new String[]{""});
		bla(new String[]{"1"});
		bla(new String[]{"1,2"});
		bla(new String[]{"4"});
		bla(new String[]{"5,7"});
		bla(new String[]{"5,17"});
		bla(new String[]{"5,6,7"});
		bla(new String[]{"5,6,7"});
		bla(new String[]{"5,6,7,8,9,10"});
		bla(new String[]{"5,6\n7,8\n9,10"});
	}
	
	private static void bla(String[] args) {
		System.out.println("input: " + args[0]);
		
		if (args[0].equals("")) {
			System.out.println("output: 0");
			return;
		}
		
		String[] numbers = args[0].split(",");
		List lista = new LinkedList();
		int xxx = 0;
		for(;;)
		{
			if(xxx >= numbers.length)
				break;
			if(numbers[xxx].contains("\n"))
			{
				String[] temp = numbers[xxx].split("\n");
				lista.add(temp)
				;
				numbers[xxx] = "0";
				
			}
			xxx++;
		}
		
		
		int posplitowaneponowejlinii = 0;
		xxx=0;
		for(;;xxx++)
		{
			if(xxx>=lista.size())
				break;
			if(lista.size() != 0){
			String[] temp = (String[]) lista.get(xxx);
			posplitowaneponowejlinii += temp.length;}
		}
		if (numbers.length == 1) {
			System.out.println("output: " + numbers[0]);
			return;
		}

		
			Integer x = Integer.valueOf(numbers[0]);
			Integer y = Integer.valueOf(numbers[1]);
			
			int result = x+y;
			
			if (numbers.length + posplitowaneponowejlinii == 3) {
				result += Integer.valueOf(numbers[2]);
			}
			
			if(numbers.length + posplitowaneponowejlinii> 3)
			{
				int lol = 0;
				result -= x+y;
			do {
				result += Integer.valueOf(numbers[lol]);
				lol = lol +1;
			} while (lol < numbers.length);
			
			for (Object liczba : lista) {
				String[] liczby = (String[]) liczba;
				int i = 0;
				while (i<liczby.length){
					result += Integer.valueOf(liczby[i]);
					i++;
				}
			}
	}

			System.out.println("output " + result);
	}
}
