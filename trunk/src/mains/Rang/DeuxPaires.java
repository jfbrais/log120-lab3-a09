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
		int denomPaire2 = 0;
		int denomKicker = 0;
		boolean found = false;
		
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
					{
						denomPaire2=denomPaire1;
						denomPaire1=no;
					}
					else
					{
						denomPaire2=no;
					}
					found = true;
				}
			else
			{
				denomKicker = no;
				no = Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination());
			}
		}

		if (found)
		{
			analyseMain.setRangReconnu(new RangPoker(this,(Denomination)Denomination.DENOMINATIONS.get(denomPaire1)));
			analyseMain.getRangReconnu().deuxiemePaire((Denomination)Denomination.DENOMINATIONS.get(denomPaire2));
			analyseMain.getRangReconnu().setKicker((Denomination)Denomination.DENOMINATIONS.get(denomKicker));
			return true;
		}
		
		return false;
	}

}
