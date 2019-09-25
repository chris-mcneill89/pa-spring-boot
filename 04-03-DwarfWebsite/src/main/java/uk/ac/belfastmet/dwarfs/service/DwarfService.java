package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dwarfs.controller.DwarfController;
import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class DwarfService {

	private ArrayList<Dwarf> disneyDwarfs;
	private ArrayList<Dwarf> tolkienDwarfs;
	Logger logger = LoggerFactory.getLogger(DwarfController.class);

	@Autowired
	private DwarfRepository dwarfRepository;

	/**
	 * method to create an arraylist of disney dwarfs
	 * 
	 * @return arraylist of disney dwarfs
	 */
	public ArrayList<Dwarf> getDisneyDwarfs() {

		this.disneyDwarfs = new ArrayList<Dwarf>();
		logger.info("Service - Disney Dwarf Arraylist created");

		// add dwarfs
		/*
		 * this.disneyDwarfs.add(new Dwarf("Sleepy", "Disney", "Sleepy.png"));
		 * this.disneyDwarfs.add(new Dwarf("Happy", "Disney", "Happy.png"));
		 * this.disneyDwarfs.add(new Dwarf("Grumpy", "Disney", "Grumpy.png"));
		 * this.disneyDwarfs.add(new Dwarf("Sneezy", "Disney", "Sneezy.png"));
		 * this.disneyDwarfs.add(new Dwarf("Dopey", "Disney", "Dopey.png"));
		 * this.disneyDwarfs.add(new Dwarf("Bashful", "Disney", "Bashful.png"));
		 * this.disneyDwarfs.add(new Dwarf("Doc", "Disney", "Doc.png"));
		 */

		Iterable<Dwarf> dwarfs = dwarfRepository.findAll();
		logger.info("Service - iterable" + dwarfs.toString());
		Iterator<Dwarf> iterator = dwarfs.iterator();
		while (iterator.hasNext()) {
			this.disneyDwarfs.add(iterator.next());
			logger.info("Service - Disney Dwarf added to arraylist");
		}

		return this.disneyDwarfs;

	}

	/**
	 * Method to create an arraylist of Tolkien dwarfs
	 * @return arraylist of Tolkien dwarfs
	 */
	public ArrayList<Dwarf> getTolkienDwarfs() {

		this.tolkienDwarfs = new ArrayList<Dwarf>();
		logger.info("Service - Disney Dwarf Arraylist created");

		// add dwarfs
		/*
		 * this.tolkienDwarfs.add(new Dwarf("Balin", "Tolkien", "Balin.png"));
		 * this.tolkienDwarfs.add(new Dwarf("Bifur", "Tolkien", "Bifur.png"));
		 * this.tolkienDwarfs.add(new Dwarf("Bofur", "Tolkien", "Bofur.png"));
		 * this.tolkienDwarfs.add(new Dwarf("Bombur", "Tolkien", "Bombur.png"));
		 * this.tolkienDwarfs.add(new Dwarf("Dori", "Tolkien", "Dori.png"));
		 * this.tolkienDwarfs.add(new Dwarf("Dwalin", "Tolkien", "Dwalin.png"));
		 * this.tolkienDwarfs.add(new Dwarf("Fili", "Tolkien", "Fili.png"));
		 * this.tolkienDwarfs.add(new Dwarf("Gloin", "Tolkien", "Gloin.png"));
		 * this.tolkienDwarfs.add(new Dwarf("Kili", "Tolkien", "Kili.png"));
		 * this.tolkienDwarfs.add(new Dwarf("Nori", "Tolkien", "Nori.png"));
		 * this.tolkienDwarfs.add(new Dwarf("Oin", "Tolkien", "Oin.png"));
		 * this.tolkienDwarfs.add(new Dwarf("Ori", "Tolkien", "Ori.png"));
		 * this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
		 */
		
		Iterable<Dwarf> dwarfs = dwarfRepository.findAll();
		logger.info("Service - iterable" + dwarfs.toString());
		Iterator<Dwarf> iterator = dwarfs.iterator();
		while (iterator.hasNext()) {
			this.tolkienDwarfs.add(iterator.next());
			logger.info("Service - Tolkien Dwarf added to arraylist");
		}

		return this.tolkienDwarfs;

	}

}
