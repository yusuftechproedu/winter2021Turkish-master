package day03_scannerincrementdecrement;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {




        //kukllanıcıdan aldığınız 4 basamaklı sayının basamaklardaki rakamlar toplamını bulunuz (7532)
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayı giriiz");
        int sayi= scan.nextInt();
        int rakam= 0;
        int rakamlarToplami=0;
        // 1.adım r=0 rt= sayi=7532
        rakam=sayi%10; // bana 2 yi verir
        rakamlarToplami+=rakam; // 2 oldu
        sayi/=10; //753 oldu int olduğundan double vs değil
        rakam=sayi%10; // 3 oldu
        rakamlarToplami+=rakam;// 5
        sayi /=10; // int oldugundan 75
        rakam=sayi%10; //5
        rakamlarToplami += rakam;//10
        sayi /=10; // int olduğundan 7 olur
        rakam=sayi%10; // 7
        rakamlarToplami+=rakam; // 17 oldu
        sayi /=10; // 0
        System.out.println("girdigınız sayının rakamlar toplamı " + rakamlarToplami);


      }
}
