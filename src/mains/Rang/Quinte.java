package mains.Rang;

import java.util.ArrayList;

import cartes.*;
import mains.*;

public class Quinte extends AbstractAnalyseurRang
{
	private ArrayList<Carte> collCarte = new ArrayList<Carte>();

	@Override
	public boolean reconnaitreMain(ReqAnalyseMain analyseMain)
	{
		collCarte = analyseMain.getMain().getCartes();

		int no = Denomination.DENOMINATIONS.indexOf(collCarte.get(0).getDenomination());
		for (int i = 1; i < collCarte.size(); i++)
		{
			if (Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination()) == no + 1)
				no++;
			else
			{				
				if (Denomination.DENOMINATIONS.indexOf(collCarte.get(0).getDenomination()) == 0 && 
						Denomination.DENOMINATIONS.indexOf(collCarte.get(1).getDenomination()) == 1 && 
								Denomination.DENOMINATIONS.indexOf(collCarte.get(2).getDenomination()) == 2 && 
										Denomination.DENOMINATIONS.indexOf(collCarte.get(3).getDenomination()) == 3 && 
												Denomination.DENOMINATIONS.indexOf(collCarte.get(4).getDenomination()) == 12)
					return true;
				else
					return false;
			}
		}

		return true;
	}

}
