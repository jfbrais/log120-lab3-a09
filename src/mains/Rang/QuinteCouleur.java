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
 Nom du fichier :	 QuinteCouleur.java 					 
 Date créée :        2009-11-10
 Date dern. modif. : 2009-11-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-11-10 : Status Initial
 *******************************************************/

package mains.Rang;

import mains.*;

/**
 * Analyseur de main pour trouver une Quinte Couleur.
 * @author Gab
 *
 */
public class QuinteCouleur extends AbstractAnalyseurRang
{

	@Override
	public boolean reconnaitreMain(ReqAnalyseMain analyseMain)
	{
		if (new Couleur().reconnaitreMain(analyseMain))
			if (new Quinte().reconnaitreMain(analyseMain))
				{	
					analyseMain.setRangReconnu(new RangPoker(this,analyseMain.getRangReconnu().getDenom()));
					return true;
				}
			
		return false;
	}

}
