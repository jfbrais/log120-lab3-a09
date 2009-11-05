package mains;

import cartes.*;
import mains.Rang.*;
import java.util.*;

public abstract class AbstractAnalyseurRang
{
	private AbstractAnalyseurRang suivant;
	
	public abstract boolean reconnaitreMain(ReqAnalyseMain analyseMain);
	
	public AbstractAnalyseurRang getSuivant()
	{
		return suivant;
	}
	
	public void setSuivant(AbstractAnalyseurRang newSuivant)
	{
		suivant = newSuivant;
	}
	
	public void traiterDemande(Collection<Carte> collCarte, ReqAnalyseMain analyseMain)
	{
		if (!reconnaitreMain(analyseMain))
		{
			if (suivant!=null)
				suivant.traiterDemande(collCarte, analyseMain);
		}
	}
}
