package immo;

public class Terrain extends BienImmo {

	private Integer AnneeAc;
	
	public Terrain(double S, Adresse adr, int Aac)
	{
		super(S,adr);
		AnneeAc = Aac;
		
	}

	
	public double getImpot()
	{
		double impots = 0;
		
		if(Surface <= 100)
		{
			impots += (Surface * 10);
		}
		else
		{
			impots += (Surface + 15);
		}
		
		return impots;
	}
	
	public String toString()
	{
		return " < Terrain >\n  " + super.toString() +"  \n  Acquit en  " + AnneeAc + "\n    Impot à payer = " + getImpot();
	}
	
}
