package overiding;

public class MejaKantor extends Meja{
	//child class
	float x=5;
	//overriding
	public void jenis() {
		System.out.println("meja Ruang kerja");
	}
	public void jenis2() {
		System.out.println("meja Ruang Tamu");
	}
	
	//overloading
	public void produk(int harga) {
		System.out.println(harga);
	}
	public void produk(int total,String diskon) {
		
		if(x<=total) {
			System.out.println("total barang "+total+" anda mendapat diskon "+diskon);
		}else {
			System.out.println("total barang "+total+" anda tidak mendapat diskon");
		}
	}
	public void produk(int total,int cash) {
		System.out.println("====================================");
		System.out.println("total barang = "+total);
		System.out.println("cash = "+ cash);
		System.out.println("kembalian = "+(cash-total));
	}
}
