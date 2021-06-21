package overiding;

public class PolimorfismeTest extends MejaKantor{
	//grand child class
	public static void main(String[] args) {
		System.out.println("=======Overriding========");
		Meja kerjaParents= new Meja();
			kerjaParents.jenis();
			kerjaParents.jenis2();
		MejaKantor kerja= new MejaKantor();
			kerja.jenis();
			kerja.jenis2();
			
			
		System.out.println("=======Overloading========");
		System.out.println("overloading 1");
		Meja merk1= new Meja();
			merk1.produk();
			//merk1.produk(10000);
			merk1.produk(5, "high","blue");
			merk1.produk("baik");
			//merk1.produk(7,"10%");
			//merk1.produk(2, "10%");
			//merk1.produk(50000, 55000);
		MejaKantor merk= new MejaKantor();
		System.out.println("\noverloading 2");
			merk.produk();
			merk.produk(50000);
			merk.produk(5, "super","red");
			merk.produk("baik");
			merk.produk(6, "10%");
			merk.produk(4, "10%");
			merk.produk(50000, 55000);
	}
	
}
