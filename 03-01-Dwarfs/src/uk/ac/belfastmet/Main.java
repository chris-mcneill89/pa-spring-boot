package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		ArrayList<String> dwarfs = new ArrayList<String>();
		
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Sneezy");
		dwarfs.add("Doc");
		dwarfs.add("Grumpy");
		dwarfs.add("Bashful");
		dwarfs.add("Dopey");
		
		System.out.println("The seven dwarfs are: ");
		
		for(String dwarf: dwarfs) {
			System.out.println(dwarf);
		}
		
		ArrayList<String> dwarves = new ArrayList<String>();
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("Fili");
		dwarves.add("Wili");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Oin");
		dwarves.add("Ori");
		dwarves.add("Gloin");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");
		
		System.out.println("The dwarves in the company of Thorin are: ");
		
		for(String dwarf: dwarves) {
			System.out.println(dwarf);
			}

	}

}
