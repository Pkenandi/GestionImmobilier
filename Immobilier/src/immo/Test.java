package immo;

public class Test {

	public static void main(String[] args) 
	{
		Adresse adr = new Adresse("Monastir","El Omran",50);
		Adresse adr1 = new Adresse("Monastir","sahlil",100);
		BienImmo BI1 = new Habitation(50,adr,5,2019);
		BienImmo BI2 = new Terrain(150,adr1,2020);
		
		System.out.println(BI1.toString());
		System.out.println(BI2.toString());
		
	}

}
