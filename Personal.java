public class Personal{
	public static void main(String[] args) {

		Person anton = new Person();

		// memanggil atribut dan memberi nilai

		anton.Nama = "Anton";
		anton.JenisKelamin = "Pria";
		anton.Umur = 22;
		System.out.println("Nama : " + anton.Nama);
		System.out.println("JenisKelamin : " + anton.JenisKelamin);
		System.out.println("Umur : " + anton.Umur);


		Person riko = new Person();
	
		riko.Nama = "Riko";
		riko.JenisKelamin = "Pria";
		riko.Umur = 25 ;
		System.out.println("Nama : " + riko.Nama);
		System.out.println("JenisKelamin : " + riko.JenisKelamin);
		System.out.println("Umur : " + riko.Umur);
	}
}