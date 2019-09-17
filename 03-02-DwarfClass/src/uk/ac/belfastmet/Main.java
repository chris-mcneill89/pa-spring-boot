package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		dwarfs.add(sleepy);
		
		Dwarf happy = new Dwarf();
		happy.setName("Happy");
		happy.setAuthor("Disney");
		dwarfs.add(happy);
		
		
		Dwarf grumpy = new Dwarf();
		grumpy.setName("Grumpy");
		grumpy.setAuthor("Disney");
		dwarfs.add(grumpy);
		
		Dwarf doc = new Dwarf();
		doc.setName("Doc");
		doc.setAuthor("Disney");
		dwarfs.add(doc);
		
		Dwarf thorin = new Dwarf();
		thorin.setName("Thorin");
		thorin.setAuthor("Tolkien");
		dwarfs.add(thorin);
		
		Dwarf balin = new Dwarf();
		balin.setName("Balin");
		balin.setAuthor("Tolkien");
		dwarfs.add(balin);
		
		Dwarf bifur = new Dwarf();
		bifur.setName("Bifur");
		bifur.setAuthor("Tolkien");
		dwarfs.add(bifur);
		
		Dwarf bofur = new Dwarf();
		bofur.setName("Bofur");
		bofur.setAuthor("Tolkien");
		dwarfs.add(bofur);
		
		System.out.println("\n"+"Disney dwarfs are: "+"\n");
		for(Dwarf dwarf:dwarfs) {
			String name = dwarf.getName();
			String author = dwarf.getAuthor();
			if(author == "Disney") {
				System.out.println(name);
			}
		}
		
		System.out.println("\n"+"Hobbit dwarfs are: "+"\n");
		for(Dwarf dwarf:dwarfs) {
			String name = dwarf.getName();
			String author = dwarf.getAuthor();
			if(author == "Tolkien") {
				System.out.println(name);
			}
		}
		
	}

}
