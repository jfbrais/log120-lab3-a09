package mains.Rang;

import java.util.ArrayList;

import cartes.Carte;
import cartes.Denomination;
import mains.*;

public class DeuxPaires extends AbstractAnalyseurRang
{
	private ArrayList<Carte> collCarte = new ArrayList<Carte>();

	@Override
	public boolean reconnaitreMain(ReqAnalyseMain analyseMain)
	{
		collCarte = analyseMain.getMain().getCartes();
				
		int paires = 0;
		int denomPaire1 = 0;
		int no = Denomination.DENOMINATIONS.indexOf(collCarte.get(0).getDenomination());
		for (int i=1;i<collCarte.size();i++)
		{
			if (Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination())==no)
				if (paires==0)
				{
					denomPaire1=no;
					paires++;
				}
				else
				{
					if (denomPaire1<no)
						denomPaire1=no;
					analyseMain.setRangReconnu(new RangPoker(this,(Denomination)Denomination.DENOMINATIONS.get(denomPaire1)));
					return true;
				}
			else
				no = Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination());
		}

		return false;
	}

}
