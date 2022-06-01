package Hesaplamalar;

import java.util.Scanner;

public class KdvHesaplamasi {

    public static void main(String[] args) {
        double tutar, kdvorani,kdvliFiyat,kdvTutari;
        boolean kdvDegiskeni;

        Scanner input =new Scanner(System.in);
        System.out.println("Miktari Giriniz : ");
        tutar = input.nextDouble();
        System.out.println(tutar);

       /*
       if komutu ile booleandan daha kolay olabilir

       if (tutar>1000) {
            kdvorani=0.08;

        }
        */

        kdvDegiskeni=(0<tutar) &&(1000>tutar);
        kdvorani=kdvDegiskeni ? 0.18 : 0.08;

        kdvliFiyat=tutar+tutar*kdvorani;
        kdvTutari=tutar*kdvorani;


        System.out.println("KDV'li Tutar : "+kdvliFiyat);
        System.out.println("KDV Tutari : " +kdvTutari);
        System.out.println("KDV'siz Tutar : "+tutar);
        System.out.println("KDV Miktari : "+ "%" + kdvorani*100);

        
    }
}
