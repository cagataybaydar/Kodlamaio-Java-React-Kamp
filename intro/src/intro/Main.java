package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase yaz� tipi
		//Don't repeat yourself
		double dolarDun = 8.5;
		double dolarBugun = 8.5;
		
		int vade = 36;
		
		Boolean dustuMu = true;
		
				
		String internetSubeButonu = "�nternet �ubesi";
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) 
		{
			System.out.println("Dolar d��t� resmi");
		}
		else if (dolarBugun>dolarDun) 
		{
			System.out.println("Dolar y�kseldi resmi");
		}		
		else 
		{
			System.out.println("Dolar sabit resmi");

		}
		System.out.println("*************************");
		
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu Emekli Kredi";
		String kredi3 = "Konut Kredi";
		String kredi4 = "�ift�i Kredi";
		String kredi5 = "Msb Kredi";
		String kredi6 = "Meb Kredi";
		
		String[] krediler = 
			{
				"H�zl� Kredi",
				"Mutlu Emekli Kredi",
				"Konut Kredi",
				"�ift�i Kredi",
				"Msb Kredi",
				"Meb Kredi",
				"K�lt�r Bakanl��� kredisi"
			};	
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i=0	; i<krediler.length;i++) {
			System.out.println(krediler[i]);

		}
		
			int sayi1 = 10;
			int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		System.out.println("******************");
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		System.out.println("******************");
		
		String sehir1 = "�stanbul";
		String sehir2 = "Ankara";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
		

			
		

	}

}
