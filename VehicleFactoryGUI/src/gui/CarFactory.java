package gui;

import java.util.Random;

public class CarFactory {
	
	static String name;
	static int passengers;
	static int fuelcap;
	static int mpg; 
	static int doors;
	static double tonage; 
	static int year;
	static int totalmiles;
	static int wheelsize; 
	static int color;
	static int range;
	static int gaslvl;
	static int cleandirty;
	static boolean carRunning = false;
	
	Random rand = new Random(); 
	
	public CarFactory() {
		name = "Betty";
		passengers = 1;
		fuelcap = 1;
		mpg = 1;
		doors = 1;
		tonage = 1;
		year = 1;
		totalmiles = 1;
		wheelsize = 1;
		color = 1;
		range = 1;
		gaslvl = 1;
		cleandirty = 1;
		new ActionMenu();
	}

	public CarFactory(String name2, int i, int j, int k, int l, double m, int n, int o, int p, int q, int r, int s, int t) {
		name = name2;
		passengers = i;
		fuelcap = j;
		mpg = k;
		doors = l;
		tonage = m;
		year = n;
		totalmiles = o;
		wheelsize = p;
		color = q;
		range = r;
		gaslvl = s;
		cleandirty = t;
		new ActionMenu();
	}
	
	public CarFactory(String name2, int i, int j, int k, double l, int m, int n, int o, int p) {
		name = name2;
		passengers = i;
		fuelcap = j;
		mpg = k;
		doors = m;
		tonage = l;
		year = 2019;
		totalmiles = n;
		wheelsize = o;
		color = p;
		range = j * k;
		gaslvl = rand.nextInt(101);;
		cleandirty = rand.nextInt(11);;
		new ActionMenu();
	}
}
