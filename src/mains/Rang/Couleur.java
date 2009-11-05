package mains.Rang;

import java.util.ArrayList;
import mains.*;
import cartes.*;

public class Couleur extends AbstractAnalyseurRang
{
	private CouleurCarte couleur;
	private ArrayList<Carte> collCarte = new ArrayList<Carte>();
	
	@Override
	public boolean reconnaitreMain(ReqAnalyseMain analyseMain)
	{
		collCarte = analyseMain.getMain().getCartes();
		couleur = collCarte.get(0).getCouleur();
		for (int i=1;i<5;i++)
		{
			if (collCarte.get(i).getCouleur() != couleur)
				return false;
		}
		return true;
	}

}
