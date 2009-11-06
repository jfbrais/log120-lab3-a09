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
	
	public AbstractAnalyseurRang setSuivant(AbstractAnalyseurRang newSuivant)
	{
		suivant = newSuivant;
		
		return this;
	}
	
	public void traiterDemande(ReqAnalyseMain analyseMain)
	{
		if (!reconnaitreMain(analyseMain))
		{
			if (suivant!=null)
				suivant.traiterDemande(analyseMain);
		}
	}
}
