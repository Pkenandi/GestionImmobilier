package immo;

class Adresse
{
	private String Ville;
	private String Cite;
	private Integer NumAv;
	
	public Adresse()
	{
		
	}
	
	public Adresse(String V, String C, Integer N)
	{
		Ville = V;
		Cite = C;
		NumAv = N;
	}
	
	public String toStirng()
	{
		return " | " + Ville + " - " + Cite + " - " + NumAv + " | ";
	}
}

public class BienImmo 
{
	protected double Surface;
	protected Adresse adresse; 
	
	public BienImmo(double S, Adresse adr) 
	{
		Surface  = S;
		adresse = adr;
	}
	
	public double getImpot()
	{
		return 0;
	}
	
	public String toString()
	{
		return "  " + adresse.toStirng() + " Surface : " + Surface;
	}

}
