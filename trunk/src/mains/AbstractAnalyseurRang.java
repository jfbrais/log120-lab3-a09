package mains;

import cartes.*;
import mains.Rang.*;

public abstract class AbstractAnalyseurRang
{
	private AbstractAnalyseurRang suivant;
	
	public abstract boolean reconnaitreMain();
	
	public AbstractAnalyseurRang getSuivant()
	{
		return suivant;
	}
	
	public void setSuivant(AbstractAnalyseurRang newSuivant)
	{
		suivant = newSuivant;
	}
	
	public void traiterDemande()
	{
		if (!reconnaitreMain())
		{
			if (suivant!=null)
				suivant.traiterDemande();
		}
	}
}
