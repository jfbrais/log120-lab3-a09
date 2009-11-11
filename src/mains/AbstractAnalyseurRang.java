/******************************************************
 Cours :             LOG120
 Session :           Saison automne 2009
 Groupe :            03
 Projet :            Laboratoire #3
 �tudiant(e)(s) :    Gabriel Desmarais
 					 Jean-Fran�ois Brais-Villemur
 Code(s) perm. :     DESG24078908
 					 BRAJ14088901
 Professeur :        Jocelyn Beno�t
 Charg� de labo.:    Vincent Carrier
 					 Yanick Rochon
 Nom du fichier :	 AbstractAnalyseurRang.java 					 
 Date cr��e :        2009-11-10
 Date dern. modif. : 2009-11-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-11-10 : Status Initial
 *******************************************************/

package mains;

/**
 * Classe abstraite servant de base pour toutes les types de reconnaissance dans un paquet de 5 cartes.
 * @author Gab
 *
 */
public abstract class AbstractAnalyseurRang
{
	private AbstractAnalyseurRang suivant;
	
	/**
	 * D�termine s'il se reconnait dans la main donn�e.
	 * @param analyseMain
	 * @return boolean
	 */
	public abstract boolean reconnaitreMain(ReqAnalyseMain analyseMain);
	
	/**
	 * Retourne le suivant dans la liste de responsabilit�.
	 * @return suivant
	 */
	public AbstractAnalyseurRang getSuivant()
	{
		return suivant;
	}
	
	/**
	 * Configure son d�tecteur suivant.
	 * @param newSuivant
	 * @return this
	 */
	public AbstractAnalyseurRang setSuivant(AbstractAnalyseurRang newSuivant)
	{
		suivant = newSuivant;
		
		return this;
	}
	
	/**
	 * Tente de reconnaitre la main, s'il ne la reconnait pas, demande au suivant de tenter l'op�ration.
	 * @param analyseMain
	 */
	public void traiterDemande(ReqAnalyseMain analyseMain)
	{
		if (!reconnaitreMain(analyseMain))
		{
			if (suivant!=null)
				suivant.traiterDemande(analyseMain);
		}
	}
}
