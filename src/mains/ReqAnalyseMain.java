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
 Nom du fichier :	 ReqAnalyseMain.java 					 
 Date créée :        2009-11-10
 Date dern. modif. : 2009-11-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-11-10 : Status Initial
 *******************************************************/

package mains;

/**
 * Classe de demande d'analyse possèdant une main et son rang.
 * @author Gab
 *
 */
public class ReqAnalyseMain
{
	private RangPoker rang;
	private Main main;
	
	/**
	 * Constructeur d'une demande d'analyse avec une main.
	 * @param newMain
	 */
	public ReqAnalyseMain(Main newMain)
	{
		main = newMain;
	}
	
	/**
	 * Retourne la main de la demande.
	 * @return main
	 */
	public Main getMain()
	{
		return main;
	}
	
	/**
	 * Retourne le rang de la main de la demande.
	 * @return rang
	 */
	public RangPoker getRangReconnu()
	{
		return rang;
	}
	
	/**
	 * Configure le rang de la main de la demande.
	 * @param newRang
	 */
	public void setRangReconnu(RangPoker newRang)
	{
		rang = newRang;
	}
}
