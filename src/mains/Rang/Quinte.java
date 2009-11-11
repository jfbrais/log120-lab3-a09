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
 Nom du fichier :	 Quinte.java 					 
 Date créée :        2009-11-10
 Date dern. modif. : 2009-11-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-11-10 : Status Initial
 *******************************************************/

package mains.Rang;

import java.util.ArrayList;

import cartes.*;
import mains.*;

/**
 * Analyseur de main pour trouver une Quinte.
 * @author Gab
 *
 */
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
			if (Denomination.DENOMINATIONS.indexOf(collCarte.get(i).getDenomination()) == no - 1)
				no--;
			else
			{				
				if (Denomination.DENOMINATIONS.indexOf(collCarte.get(0).getDenomination()) == 12 && 
						Denomination.DENOMINATIONS.indexOf(collCarte.get(1).getDenomination()) == 3 && 
								Denomination.DENOMINATIONS.indexOf(collCarte.get(2).getDenomination()) == 2 && 
										Denomination.DENOMINATIONS.indexOf(collCarte.get(3).getDenomination()) == 1 && 
												Denomination.DENOMINATIONS.indexOf(collCarte.get(4).getDenomination()) == 0)
					{
						analyseMain.setRangReconnu(new RangPoker(this,collCarte.get(1).getDenomination()));
						return true;
					}
				else
					return false;
			}
		}
		
		analyseMain.setRangReconnu(new RangPoker(this,collCarte.get(0).getDenomination()));
		return true;
	}

}
