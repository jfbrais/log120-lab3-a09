package mains.Rang;

import mains.*;

public class QuinteCouleur extends AbstractAnalyseurRang
{

	@Override
	public boolean reconnaitreMain(ReqAnalyseMain analyseMain)
	{
		if (new Couleur().reconnaitreMain(analyseMain))
			if (new Quinte().reconnaitreMain(analyseMain))
				return true;
			
		return false;
	}

}
