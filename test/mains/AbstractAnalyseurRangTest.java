package mains;

import mains.Rang.*;

public class AbstractAnalyseurRangTest
{
	private AbstractAnalyseurRang first = new QuinteRoyale();

	public AbstractAnalyseurRangTest(String arg0)
	{
		first	.setSuivant(new Quintuplet()
				.setSuivant(new QuinteCouleur()
				.setSuivant(new Carre()
				.setSuivant(new MainPleine()
				.setSuivant(new Couleur()
				.setSuivant(new Quinte()
				.setSuivant(new Brelan()
				.setSuivant(new DeuxPaires()
				.setSuivant(new Paire()
				.setSuivant(new CarteSuperieure()))))))))));
		
		// first.getSuivant().setSuivant(new QuinteCouleur());
		// first.getSuivant().getSuivant().setSuivant(new Carre());
		// first.getSuivant().getSuivant().getSuivant().setSuivant(new
		// MainPleine());
		// first.getSuivant().getSuivant().getSuivant().getSuivant().setSuivant(new
		// Couleur());
		// first.getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().setSuivant(new
		// Quinte());
		// first.getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().setSuivant(new
		// Brelan());
		// first.getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().setSuivant(new
		// DeuxPaires());
		// first.getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().setSuivant(new
		// Paire());
		// first.getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().getSuivant().setSuivant(new
		// CarteSuperieure());
	}
}
