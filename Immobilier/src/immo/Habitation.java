package immo;

public class Habitation extends BienImmo {

	private Integer Nbr_pieces;
	private Integer AnneeConst;
	
	public Habitation(double S, Adresse adr, Integer nbr, Integer ac) 
	{
		super(S,adr);
		Nbr_pieces = nbr;
		AnneeConst = ac;
	}
	
	public double getImpot()
	{
		double impots = 0;
		
		if(Surface <= 20)
		{
			impots += (Surface * 50);
		}
		else if(Surface <= 40)
		{
			impots += (Surface * 70);
		}else
		{
			impots += (Surface * 100);
		}
		
		return impots;
	}
	
	public String toString()
	{
		return " < Habitation >\n  " + super.toString() +" <"+ Nbr_pieces +"> pieces \n  Construit en " + AnneeConst + "\n    Impot à payer = " + getImpot();
	}

}
