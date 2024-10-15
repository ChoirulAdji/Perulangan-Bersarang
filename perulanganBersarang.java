/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;
import java.util.Scanner;
/**
 *
 * @author Choirul Adji
 */
public class perulanganBersarang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, c1, c2, c3, hargaBaru, jumlah, total, grandTotal=0;
        int sandalJepit = 15000, sandalSlop = 45000, sandalEiger = 80000;
        int newBalance= 1200000, converse = 700000, vans = 400000;
        do{
            System.out.println("SELAMAT DATANG DI TOKO ^^");
            System.out.println("=========================");
            System.out.println("========PILIH MENU=======");
            System.out.println("1. Kasir");
            System.out.println("2. Admin");
            System.out.println("3. Owner");
            System.out.println("4. Exit");
            System.out.print("^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.print("\nSilahkan pilih menu diatas : ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    do{
            System.out.println("       PILIH MENU       ");
            System.out.println("1. Sandal\n2. Sepatu\n3. Exit");
            System.out.print("\nSilahkan pilih menu diatas : "); 
            c1= sc.nextInt();
            switch(c1){
                    case 1:
                        do{
                        System.out.println("BERIKUT BEBERAPA JENIS SANDAL YANG TERSEDIA");
                        System.out.println("1. JEPIT [" +sandalJepit + "]");
                        System.out.println("2. SLOP  [" +sandalSlop +  "]");
                        System.out.println("3. EIGER [" +sandalEiger + "]");
                        System.out.println("4. Selesai");
                        System.out.print("Silahkan pilih yang anda inginkan : ");
                        c2=sc.nextInt();
                        switch(c2){
                        case 1:
                            System.out.println(" JEPIT ");
                            System.out.print(" Jumlah : ");
                            jumlah=sc.nextInt();
                            total=jumlah*sandalJepit;
                            grandTotal = grandTotal+total;
                            System.out.println("Total       = "+total);
                            System.out.println("Grand Total = "+grandTotal);
                            break;
                        case 2:
                            System.out.println(" SLOP ");
                            System.out.print(" Jumlah : ");
                            jumlah=sc.nextInt();
                            total=jumlah*sandalSlop;
                            grandTotal = grandTotal+total;
                            System.out.println("Total       = "+total);
                            System.out.println("Grand Total = "+grandTotal);
                            break;
                        case 3:
                            System.out.println(" EIGER ");
                            System.out.print(" Jumlah : ");
                            jumlah=sc.nextInt();
                            total=jumlah*sandalEiger;
                            grandTotal = grandTotal+total;
                            System.out.println("Total       = "+total);
                            System.out.println("Grand Total = "+grandTotal);
                            break;
                        case 4:
                            System.out.println("Back to Menu");
                            break;
                        default:
                            System.out.println("Tidak ada pilihan!");
                    }   
                    }while(c2!=4);
                    break;
                    case 2:
                    do{
                        System.out.println("BERIKUT BEBERAPA JENIS SEPATU YANG TERSEDIA");
                        System.out.println("1. New Balance [" +newBalance + "]");
                        System.out.println("2. Converse    [" +converse +   "]");
                        System.out.println("3. Vans        [" +vans +       "]");
                        System.out.println("4. Selesai");
                        System.out.print("Pilih Merk yang anda inginkan : ");
                        c2=sc.nextInt();
                        switch(c2){
                        case 1:
                            System.out.println(" NEW BALANCE ");
                            System.out.print("Jumlah : ");
                            jumlah=sc.nextInt();
                            total=jumlah*newBalance;
                            grandTotal = grandTotal+total;
                            System.out.println("Total       = "+total);
                            System.out.println("Grand Total = "+grandTotal);
                            break;
                        case 2:
                            System.out.println(" CONVERSE ");
                            System.out.print("Jumlah  = ");
                            jumlah=sc.nextInt();
                            total=jumlah*converse;
                            grandTotal = grandTotal+total;
                            System.out.println("Total       = "+total);
                            System.out.println("Grand Total = "+grandTotal);
                            break;
                        case 3:
                            System.out.println(" VANS ");
                            System.out.print("Jumlah : ");
                            jumlah=sc.nextInt();
                            total=jumlah*vans;
                            grandTotal = grandTotal+total;
                            System.out.println("Total       = "+total);
                            System.out.println("Grand Total = "+grandTotal);
                            break;
                        case 4:
                            System.out.println("Back to menu");
                            break;
                        default:
                            System.out.println("Tidak ada pilihan!");         
                    }    
                    }while(c2!=4); break;
                        
                    case 3:
                        System.out.println("Kembali");
                        break;
                   
            }
                    }while(c1!=3);
                    break;
                case 2:
                    do{
                        System.out.println("   WELCOME ADMIN  ");
                        System.out.println("1. Ubah Harga Sandal Jepit\n2. Ubah Harga Sandal Slop\n3. Ubah Harga Sandal Eiger ");
                        System.out.println("4. Ubah Harga Sepatu New Balance\n5. Ubah Harga Sepatu Converse");
                        System.out.println("6. Ubah Harga Sepatu Vans\n7. Selesai. ");
                        System.out.print("Pilih : "); c3=sc.nextInt();
                        switch(c3){
                            case 1:
                                System.out.println(" HARGA SANDAL JEPIT ");
                                System.out.print("Input Harga Baru : "); 
                                hargaBaru=sc.nextInt();
                                sandalJepit = hargaBaru;
                                System.out.println("HARGA DIPERBARUI!");
                                break;
                            case 2:
                                System.out.println(" HARGA SANDAL SLOP ");
                                System.out.print("Input Harga Baru : "); 
                                hargaBaru=sc.nextInt();
                                sandalSlop = hargaBaru;
                                System.out.println("HARGA DIPERBARUI!");
                                break;
                            case 3:
                                System.out.println(" HARGA SANDAL EIGER ");
                                System.out.print("Input Harga Baru : "); 
                                hargaBaru=sc.nextInt();
                                sandalEiger = hargaBaru;
                                System.out.println("HARGA DIPERBARUI!");
                                break;
                            case 4:
                                System.out.println(" HARGA SEPATU NEW BALANCE ");
                                System.out.print("Input Harga Baru : "); 
                                hargaBaru=sc.nextInt();
                                newBalance = hargaBaru;
                                System.out.println("HARGA DIPERBARUI!");
                                break;
                            case 5:
                                System.out.println(" HARGA SEPATU CONVERSE ");
                                System.out.print("Input Harga Baru : "); 
                                hargaBaru=sc.nextInt();
                                converse = hargaBaru;
                                System.out.println("HARGA DIPERBARUI!");
                                break;
                            case 6:
                                System.out.println(" HARGA SEPATU VANS ");
                                System.out.print("Input Harga Baru : "); 
                                hargaBaru=sc.nextInt();
                                vans = hargaBaru;
                                System.out.println("HARGA DIPERBARUI!");
                                break;
                            case 7:
                                System.out.println("Back to menu");
                                break;
                            default:
                                System.out.println("Tidak ada pilihan!");
                                
                        }
                    }while(c3!=7);
                    break;
                case 3:
                    System.out.println("  OWNER MENU  ");
                    System.out.println("Total semua pemasukan " +grandTotal);
                 
                    
                    
            }
        }while(menu!=4);
        System.out.println("Sampai Bertemu Kembali^^");
    }
    
}
       
    
    

