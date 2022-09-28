/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pert_3;

/**
 *
 * @author BOBI YUSCANDRA
 */
import java.io.*;
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        
        Akun admin = new Akun();
        Akun akunBaru = new Akun();
        Akun akun = new Akun();
        String username,password;
        
        do {
            System.out.println("--- Login ---");
            System.out.println("1. Login admin");
            System.out.println("2. Buat akun baru");
            System.out.println("3. Lihat akun");
            System.out.println("4. Ubah password");
            System.out.println("5. Keluar");
            System.out.println("Pilih menu: ");
       int menu = Integer.parseInt(k.readLine());
       switch(menu){
           case 1:
               System.out.println("-- Login admin --");
               System.out.println("Masukkan username: ");
               username = k.readLine();
               System.out.println("Masukkan password: ");
               password = k.readLine();
               
           if (username.equalsIgnoreCase(admin.getUsername())
                   && password.equals(admin.getPassword())) {
               System.out.println("Sukses!");
           } else {
               System.out.println("Gagal");
           }
           break;
           
           case 2:
               System.out.println("-- Buat akun --");
               System.out.println("Masukkan username: ");
               username = k.readLine();
               System.out.println("Masukkan password: ");
               password = k.readLine();
               
               
               akunBaru = new Akun(username,password);
           break;
           
           case 3:
               System.out.println("-- Lihat akun --");
               System.out.println("1. Admin");
               System.out.println("Username: " + admin.getUsername());
               System.out.println("Password: " + admin.getPassword());
               System.out.println("");
               System.out.println("2. Akun baru");
               System.out.println("Username: " + akunBaru.getUsername());
               System.out.println("Password: " + akunBaru.getPassword()
               + "\n");
               
           break;
           
           case 4:
               System.out.println("--Ubah Password--");
               System.out.println("Masukkan password lama: ");
               password = k.readLine();
               if (password.equalsIgnoreCase(akunBaru.getPassword())) {
               System.out.println("Masukkan password baru: ");
               akunBaru.setPassword (k.readLine());
              
               
 
               
                } else {
               System.out.println("Password salah");
                }
               
               
               
               
           break;
           
           case 5:
               
           break;
       }
        } while (true);
    }
    
}
