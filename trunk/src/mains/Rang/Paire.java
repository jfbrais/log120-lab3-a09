package mains.Rang;

import java.util.ArrayList;

import cartes.Carte;
import cartes.Denomination;
import mains.*;

public class Paire extends AbstractAnalyseurRang
{
	private ArrayList<Carte> collCarte = new ArrayList<Carte>();
	
	@Override
	public boolean reconnaitreMain(ReqAnalyseMain analyseMain)
	{
		collCarte = analyseMain.getMain().getCartes();
		
		int no = Denomination.DENOMINATIONS.indexOf(collCarte.get(0).getDenomination());
		for (int i=1;i<collCarte.size();i++)
		{
			if (Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination())==no)
			{
				analyseMain.setRangReconnu(new RangPoker(this,(Denomination)Denomination.DENOMINATIONS.get(no)));
				if (i==1)
					analyseMain.getRangReconnu().setKicker(collCarte.get(3).getDenomination());
				else
					analyseMain.getRangReconnu().setKicker(collCarte.get(0).getDenomination());
				return true;
			}
			else
				no = Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination());
		}

		return false;
	}

}
