package javaproje;

import java.util.Scanner;

public class oyun {
	
	public void Baslangic() {
	Scanner scan= new Scanner(System.in); 
    
  
    
	start();
}





public void start() {
	
	int [][] zemin = new int [10][10];
    int satir=0,sutun=0, i, puan;
    puan = 0;
    String cevap;
	
    

    System.out.println("\u001B[33m Lutfen Sinif Seciniz!");
    System.out.println("\u001B[35m 1---   ER\n 2---   SUIKASTCI\n 3---   NISANCI\n 4---   BOMBACI\n 5---   YUZBASI\n 6---   MUHENDIS");
    
    try (Scanner klavye = new Scanner(System.in)) {
        int secim = klavye.nextInt();

   
        switch(secim){

        case 1 :
        	
        	er nesneer=new er(); 
        	er nesneer2 = new er("Uniforma");
        	
        	nesneer.oyuner();
        	

break;
        case 2:
        	
        	suikastci nesnesui=new suikastci();
        	suikastci nesnesui2=new suikastci("NanoTeknoloji Deri Siyah Uniforma");
        	nesnesui.suikastcioyun();
        	break;
 case 3:
        	
        	nisanci nesnenisanci=new nisanci();
        	nisanci nesnenisanci2=new nisanci("Cim Kapli Vari Kamuflaj");
        	nesnenisanci.nisancioyun();
        	break;

 case 4:
 	
 	bombaci nesnebombaci=new bombaci();
 	bombaci nesnebombaci2=new bombaci("Patlama Koruyuculu Celik Uniforma");
 	nesnebombaci.bombacioyun();
 	break;

        
 case 5:
	 	
	 	yuzbasi nesneyuzbasi=new yuzbasi();
	 	yuzbasi nesneyuzbasi2=new yuzbasi("TSK Yuzbasi Uniformasi");
	 	nesneyuzbasi.yuzbasioyun();
	 	break;
 case 6:
	 	
	 muhendis nesnemuhendis=new muhendis();
	 muhendis nesnemuhendis2=new muhendis("Takım Elbise");
	 nesnemuhendis.muhendisoyun();
	 	break;
        
        
        default:
        
        System.out.println("Lutfen 1-6 arasinda bir rakam seciniz:");
        start();
        
        
        }


    }
}





}

