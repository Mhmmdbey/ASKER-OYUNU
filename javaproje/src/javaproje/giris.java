package javaproje;

import java.util.Scanner;

public class giris {

	public class UyeGirisi{
	
	public String sifre,tsifre;
	private String Isim;
	Scanner klavye = new Scanner (System.in);
	 public UyeGirisi() {
		 System.out.println("\n Hosgeldiniz lutfen kayit olunuz \n");
	 }
		
	 public UyeGirisi(int a) {
		 System.out.println("Kullanici Adi: ");
		 Isim=klavye.next();
	 do {
		 
		 System.out.println("Sifre giriniz: ");
		 sifre= klavye.next();
		 System.out.println("Sifrenizi tekrar giriniz: ");
		 tsifre= klavye.next();
	 if(sifre.equals(tsifre)) {
	 System.out.println("Kayit Basarali "+Isim);
	 break;
	 }
	 else { 
	
	System.out.println("Sifreler Farkli Tekrar Giriniz:");
	 
	 
	 }
}
while (true);
	 
	 }
		
	}
	public String parola;
	private String isim;
	Scanner klavye = new Scanner (System.in);
	 public  giris () {
		 
		 System.out.println("\nGiris Yapiniz\n ");
	 }

	public  giris (int a)
	{
		UyeGirisi nesneKayit1= new UyeGirisi();
		UyeGirisi nesneKayit2= new UyeGirisi(1);
		giris nesnegiris=new giris();
		do {
			
			System.out.println("Kullanici Adinizi Giriniz: ");
			isim=klavye.next();
			System.out.println("Sifrenizi Giriniz: ");
			parola=klavye.next();
			
			if (isim.equals(nesneKayit2.Isim)) {
				if (parola.equals(nesneKayit2.sifre))
				{
				System.out.println("\n ----------Giris Basarili Iyi Eglenceler----------");
				break;
			}
				else 
				{
				System.out.println("Sifre Hatali Tekrar Deneyiniz!!!!!");	
				}
			}
			else {
				System.out.println("Kullanici Adi Bulunamadi Tekrar Deneyin");
				
			}
			
		}
	while (true);

	
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
}

	
	

