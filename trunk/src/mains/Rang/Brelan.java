package mains.Rang;

import java.util.ArrayList;

import cartes.Carte;
import cartes.Denomination;
import mains.*;

public class Brelan extends AbstractAnalyseurRang
{
	private ArrayList<Carte> collCarte = new ArrayList<Carte>();
	
	@Override
	public boolean reconnaitreMain(ReqAnalyseMain analyseMain)
	{
		collCarte = analyseMain.getMain().getCartes();
		
		int no = Denomination.DENOMINATIONS.indexOf(collCarte.get(0).getDenomination());
		int num = 1;
		for (int i=1;i<collCarte.size();i++)
		{
			if (Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination())==no)
				if (num<2)
				{
					num++;
				}
				else
					return true;
			else
			{
				no = Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination());
				num = 1;
			}
		}

		return false;
	}
	
}
