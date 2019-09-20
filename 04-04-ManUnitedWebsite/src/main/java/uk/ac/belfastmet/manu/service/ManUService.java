package uk.ac.belfastmet.manu.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.manu.controller.ManUController;
import uk.ac.belfastmet.manu.domain.Player;
import uk.ac.belfastmet.manu.domain.Staff;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ManUService {

	// logger class object for logging info
	Logger logger = LoggerFactory.getLogger(ManUController.class);
	ArrayList<Player> players = new ArrayList<Player>();
	ArrayList<Staff> staff = new ArrayList<Staff>();

	public ArrayList<Player> getPlayers() {

		this.players = new ArrayList<Player>();
		logger.info("Service - Players Arraylist created");

		// add players
		logger.info("Service - Begin Players Arraylist population");
		
		this.players.add(new Player("Marcus Rashford", "Striker", 22, "rashford.jpg"));
		logger.info(players.toString());
		this.players.add(new Player("Harry Maguire", "Defender", 27, "maguire.jpg"));
		this.players.add(new Player("Paul Pogba", "Midfielder", 26, "pogba.jpg"));
		this.players.add(new Player("Anthony Martial", "Forward", 24, "martial.jpg"));
		this.players.add(new Player("Luke Shaw", "Full Back", 26, "shaw.jpg"));
		this.players.add(new Player("Daniel James", "Winger", 19, "james.jpg"));
		this.players.add(new Player("Aran Wan Bissaka", "Full Back", 19, "bissaka.jpg"));
		this.players.add(new Player("Scott McTominay", "Midefielder", 23, "mctominay.jpg"));
		this.players.add(new Player("David de Gea", "Goalkeeper", 27, "degea.jpg"));
		this.players.add(new Player("Jesse Lingard", "Forward", 28, "lingard.jpg"));
		
		logger.info(players.toString());
		logger.info("Service - Arraylist populated and returned");

		return this.players;
	}

	public ArrayList<Staff> getStaff() {

		this.staff = new ArrayList<Staff>();
		logger.info("Service - Staff Arraylist created");

		// add players
		logger.info("Service - Begin Staff Arraylist population");
		
		this.staff.add(new Staff("Ole Gunnar Solskjaer", "Manager", 46, "ole.jpg"));
		this.staff.add(new Staff("Michael Carrick", "Assistant Manager", 38, "carrick.jpg"));
		this.staff.add(new Staff("Mike Phelan", "Assistant Manager", 56, "phelan.jpg"));
		this.staff.add(new Staff("Kieran McKenna", "Assistant Manager", 33, "mckenna.jpg"));
		this.staff.add(new Staff("Mark Dempsey", "Assistant Manager", 55, "dempsey.jpg"));
		this.staff.add(new Staff("Jim Lawlor", "Chief Analyst", 56, "lawlor.jpg"));
		this.staff.add(new Staff("Emilio Alvarez Blanco", "Goalkeeping Coach", 57, "blanco.jpg"));
		this.staff.add(new Staff("Ed Woodward", "Vice-Chairman", 47, "woodward.jpg"));
		this.staff.add(new Staff("Sir Bobby Charlton", "Board Member", 81, "charlton.jpg"));
		this.staff.add(new Staff("Sir Alex Ferguson", "Board Member", 60, "ferguson.jpg"));
		
		logger.info("Service - Staff Arraylist populated and returned");

		return this.staff;
	}

}
