/******************************************************
 Cours :             LOG120
 Session :           Saison automne 2009
 Groupe :            03
 Projet :            Laboratoire #3
 Étudiant(e)(s) :    Gabriel Desmarais
 					 Jean-François Brais-Villemur
 Code(s) perm. :     DESG24078908
 					 BRAJ14088901
 Professeur :        Jocelyn Benoît
 Chargé de labo.:    Vincent Carrier
 					 Yanick Rochon
 Nom du fichier :	 MainPleine.java 					 
 Date créée :        2009-11-10
 Date dern. modif. : 2009-11-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-11-10 : Status Initial
 *******************************************************/

package mains.Rang;

import java.util.ArrayList;

import cartes.Carte;
import cartes.Denomination;
import mains.*;

/**
 * Analyseur de main pour trouver une Main Pleine.
 * @author Gab
 *
 */
public class MainPleine extends AbstractAnalyseurRang
{
	private ArrayList<Carte> collCarte = new ArrayList<Carte>();

	@Override
	public boolean reconnaitreMain(ReqAnalyseMain analyseMain)
	{
		collCarte = analyseMain.getMain().getCartes();
		
		int no = Denomination.DENOMINATIONS.indexOf(collCarte.get(0).getDenomination());
		int num = 1;
		Denomination brelan = null;
		for (int i=1;i<collCarte.size();i++)
		{
			if (Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination())==no)
				if (num<2)
				{
					num++;
				}
				else
					brelan = collCarte.get(i).getDenomination();
			else
			{
				no = Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination());
				num = 1;
			}
		}

		if (brelan != null)
		{			
			no = Denomination.DENOMINATIONS.indexOf(collCarte.get(0).getDenomination());
			for (int i=1;i<collCarte.size();i++)
			{
				if (collCarte.get(i).getDenomination() != brelan)
				if (Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination())==no)
				{
					analyseMain.setRangReconnu(new RangPoker(this,brelan));
					analyseMain.getRangReconnu().deuxiemePaire((Denomination)Denomination.DENOMINATIONS.get(no));
					return true;
				}
				else
					no = Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination());
			}
		}
		return false;
	}

}
