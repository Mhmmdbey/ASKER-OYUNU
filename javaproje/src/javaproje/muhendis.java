package javaproje;

import java.util.Scanner;

public class muhendis extends karakterler {
    String silah = " Taret";
    int puan = 6;
    private String kiyafet;
     public void setKiyafet(String kiyafet) {
         this.kiyafet = kiyafet;
     }
     public String getKiyafet() {
         return this.kiyafet;
     }
    public muhendis(){
        System.out.println("--Secilen Silah: "+ silah);
    }

    public muhendis(String kiyafet){
        setKiyafet(kiyafet);
        System.out.println("---Giyilen kiyafet: "+ getKiyafet());
    }

    public static void taretKur(){
        System.out.println("----Muhendisin tareti nisan aliyor!----\n");
    }
    public void muhendisoyun() {
    	 try (Scanner klavye = new Scanner(System.in)) {
             
  		   int [][] zemin = new int [10][10];
  		    int satir=0,sutun=0, i, puan;
  		    puan = 0;
  		    String cevap;
  			
  		     
  	         System.out.println("Her Dogru Hamle Icin 6 Puan Kazanacaksiniz!!");
  	         
  	        
  	         try {Thread.sleep(1000);} catch (Exception e) {}
  	        
  	         for(i=0;i<40;i++)
  	     {
  	         satir = (int) (Math.random()*10);
  	         sutun = (int) (Math.random()*10);
  	         if(zemin[satir][sutun]!=1)
  	             zemin[satir][sutun] = 1;
  	         else
  	             i--;
  	         
  	     }
  	     do{
  	       System.out.println("\u001B[33m \n Lutfen x koordinatini giriniz:(1---10)");
 	        
 			satir = klavye.nextInt();
 			if (!(satir>1 && satir <10)) {
 				System.out.println("\u001B[33m Lutfen 1 ve 10 arasinda bir x koordinatini giriniz:");
 				
 		        
 				satir = klavye.nextInt();
 			} 
 			System.out.println("\u001B[34m \nLutfen y koordinatini giriniz:(1---10)");
 	         sutun = klavye.nextInt();
 	       if (!(sutun>1 && sutun <10)) {
				System.out.println("\u001B[34m Lutfen 1 ve 10 arasinda bir y koordinatini giriniz:!");
				sutun = klavye.nextInt();
			} 
  	         
  	         if(zemin[satir][sutun] != 1) {
  	             puan+=6;
  	             System.out.println("Dusmani vurdunuz Mevcut Puaniniz: " + puan);
  	         }
  	        }while(zemin[satir][sutun] !=1);
  	   System.out.println("Bomba Patladi");
  	        System.out.println("Oldun " + " Son puanin :"+puan);
  	                  
  	      Finish fin =new Finish();
          fin.log();
          
  	 	  
  	
  	
  }
    	
    }
}
