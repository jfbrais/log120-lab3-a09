package mains;

import cartes.*;
import mains.Rang.*;

public class ReqAnalyseMain
{
	RangPoker rang;
	Main main;
	
	public ReqAnalyseMain(Main newMain)
	{
		main = newMain;
	}
	
	public Main getMain()
	{
		return main;
	}
	
	public RangPoker getRangReconnu()
	{
		return rang;
	}
	
	public void setRangReconnu(RangPoker newRang)
	{
		rang = newRang;
	}
}
