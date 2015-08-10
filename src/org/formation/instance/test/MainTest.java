package org.formation.instance.test;

import org.formation.instance.*;

public class MainTest {

	public static void main(String[] args) {

		Chaise c = new Chaise();
		//System.out.println(c instanceof Vehicule);
		System.out.println(c instanceof Chaise);
		System.out.println(c instanceof Meuble);
		System.out.println(c instanceof Vendable);
		
		Vehicule v = new Vehicule();
		System.out.println(v instanceof Vendable);
		//System.out.println(v instanceof Meuble);
		//System.out.println(v instanceof Chaise);
		System.out.println(v instanceof Vehicule);
		System.out.println((Object)v instanceof Chaise);
		

	}

}
