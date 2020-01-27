package com.hSingh;

public class Menu {

	public static void main(String[] args) {
		Restaurant Rm = new Restaurant();
		Rm.eat();
		
		//Polymorphism of Restuarant i.e. Restuarant data type and reference of Pizza
		Restaurant Rm2 = new Pizza();
		Rm2.eat();
		//Polymorphism of Restuarant i.e. Restuarant data type and reference of Burger
		Restaurant Rm3 = new Burger();
		Rm3.eat();
		
		//
		System.out.println();
		//Polymorphic array
		
		Restaurant R1[] = new Restaurant[2];
		R1[0] = new Pizza();
		R1[1] = new Burger();
		for(int x = 0; x<2;x++){
			R1[x].eat();
		}
		
	}

}
