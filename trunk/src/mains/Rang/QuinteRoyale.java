package mains.Rang;

import java.util.ArrayList;

import cartes.Carte;
import cartes.Denomination;
import mains.*;

public class QuinteRoyale extends AbstractAnalyseurRang
{
	private ArrayList<Carte> collCarte = new ArrayList<Carte>();

	@Override
	public boolean reconnaitreMain(ReqAnalyseMain analyseMain)
	{
		collCarte = analyseMain.getMain().getCartes();
		
		if (new QuinteCouleur().reconnaitreMain(analyseMain))
			if (Denomination.DENOMINATIONS.indexOf(collCarte.get(1).getDenomination()) == 11 && Denomination.DENOMINATIONS.indexOf(collCarte.get(0).getDenomination()) == 12)
				return true;
		
		return false;
	}

}
