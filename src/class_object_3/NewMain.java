/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package class_object_3;

/**
 *
 * @author BOBI YUSCANDRA
 */

import java.io.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        Karyawan kar = new Karyawan();
        Mahasiswa mhs = new Mahasiswa ();
        Undika undika = new Undika ();
        try {
            
          do { 
              System.out.println("------");
              System.out.println("1. Cek SPP Mahasiswa");
              System.out.println("2. Cek Gaji Karyawan");
              System.out.println("3. Keluar Aplikasi");
              int pilih = Integer.parseInt (k.readLine ());
              switch (pilih){
                  case 1:
                      System.out.println("-- Cek SPP Mahasiswa --");
                      System.out.println("Nim: ");
                      mhs.setNim (k.readLine ());
                      System.out.println("Prodi: ");
                      mhs.setProdi (k.readLine ());
                      System.out.println("Angkatan: ");
                      mhs.setAngkatan (Integer.parseInt(k.readLine ()));
                      System.out.println("Semester: ");
                      mhs.setSemester (Integer.parseInt(k.readLine ()));
                      System.out.println("Total Bayar SPP: " + mhs.getSpp());
                    
                      break;
                  case 2:
                      System.out.println("-- Cek Gaji Karyawan --");
                      System.out.println("Nik: ");
                      kar.setNik (k.readLine ());
                      System.out.println("Bagian: ");
                      kar.setBagian (k.readLine ());
                      System.out.println("Gaji Per hari: ");
                      kar.setGaji_per_hari (Integer.parseInt(k.readLine ()));
                      System.out.println("Kehadiran: ");
                      kar.setKehadiran (Integer.parseInt(k.readLine ()));
                      System.out.println("Total Gaji: " + kar.getGaji());
                      
                      break;
                  case 3:
                      System.exit(0);
              }
          }while (true);
              
              
          }catch (Exception e) {
                System.out.println("Inputan salah");
        }
    }
    
}

