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
		
		analyseMain.setRangReconnu(new RangPoker(this,collCarte.get(0).getDenomination()));
		analyseMain.getRangReconnu().setCouleur(new Denomination[]{collCarte.get(0).getDenomination(),collCarte.get(1).getDenomination(),collCarte.get(2).getDenomination(),collCarte.get(3).getDenomination(),collCarte.get(4).getDenomination()});
		return true;
	}

}
