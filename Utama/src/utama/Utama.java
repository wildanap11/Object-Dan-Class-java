/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utama;

import java.util.Scanner;
public class Utama {
    public static void main(String[] args) {
        
    Kompleks ojk = new Kompleks();
    mahasiswa data;
    Scanner kal = new Scanner (System.in);
    int input;
    int inp =0;
    int jmh;
    do{
    do{
    System.out.print("Tugas tentang class-object\n1.Input data.\n2.Tampil data.\n3.Sorting data.\n4.Keluar\n");
    System.out.print("Pilih : ");               
    input = kal.nextInt();
               
                if(input<1){
                    System.out.print("\n!!!Maaf input harus diantara 1 sampai 6[1-6]!!!\n\n");
                }
                else if(input>6){
                    System.out.print("\n!!!Maaf input harus diantara 1 sampai 6[1-6]!!!\n\n");
                }               
            }while(input>6);
           
            System.out.print("=================================\n\n");
           
            switch(input){
                case 1: do{
                            System.out.print("Jumlah data mahasiswa yang dimasukan [1-100] : ");
                            jmh = kal.nextInt();
                            ojk.setINDEX(jmh);
                            if(jmh>100){
                                System.out.print("\nJumlah data mahasiswa yang dimasukan \nmelebihi kapasitas yang ditentukan\n\n");
                            }
                        }while(jmh>100);
                        for(int i = 0; i<jmh; i++){
                          
                            data = new mahasiswa();
                            System.out.println("Data mahsiswa ke-"+(i+1));
                            System.out.print("NIM : ");
                            String nim = kal.next();
                            data.setNIM(nim);
                            System.out.print("Nama : ");
                            String nam = kal.next();
                            data.setNAMA(nam);
                            System.out.print("IPK : ");
                            double ip = kal.nextDouble();
                            data.setIPK(ip);
                            System.out.print("\n");
                            ojk.set(i, data);    
                        }
                        break;
                   
                case 2: System.out.print("=================================\nMenampilkan : \n");
                        System.out.print("1.Semua.\n2.Sebagian.\n3.Salah satu.\n");
                        System.out.print("Memilih : ");
                        System.out.print("\n===================================\n");
                        int pil = kal.nextInt();
                        int ind = ojk.getINDEX();
                        switch(pil){
                            case 1: for(int i = 0; i<ind; i++){
                                        System.out.print("\n===================================\n");
                                        System.out.print("Data mahasiswa"+(i+1)+"\n");
                                        ojk.get(i);
                                    }
                                    break;
                               
                            case 2: System.out.print("data index dari : ");
                                    int drind = kal.nextInt();
                                    System.out.print("sampai index ke : ");
                                    System.out.print("\n===================================\n");
                                    int keind = kal.nextInt();
                                    
                                    if(drind<keind){
                                        for(int k=drind; k<=keind; k++){
                                            System.out.print("Data mahasiswa"+(k+1)+"\n");
                                            ojk.get(k);
                                        }
                                    }

                                    else if(drind>keind){
                                        for(int z=keind; z<drind; z++){
                                            System.out.print("Data mahasiswa"+(z+1)+"\n");
                                            ojk.get(z);
                                        }
                                    }

                                    else if(drind==keind){
                                        System.out.print("Data mahasiswa"+(keind+1)+"\n");
                                        ojk.get(keind);
                                    }

                                    break;
                            case 3: System.out.print("\n===================================\n");
                                    System.out.print("Masukan index yang ingin ditampilkan : ");
                                    int sbg = kal.nextInt();
                                    System.out.print("\n===================================\n");
                                    System.out.print("Data mahasiswa"+(sbg+1)+"\n");
                                    ojk.get(sbg);
                                    break;
                        }

                        break;
                case 3: System.out.print("=================================\nMencari : \n");
                        System.out.print("1.Sorting By Nama.\n2.Sorting By NIM.\n3.Sorting IPK.\n");
                        System.out.print("Memilih : ");
                        System.out.print("\n===================================\n");
                        int car = kal.nextInt();

                        switch(car){
                            case 1: System.out.print("Masukan Nama mahasiswa yang dicari : ");
                                    String inputNama = kal.next();   
                                    System.out.print("\n===================================\n");
                                    ojk.SearchNama(inputNama);                                    
                                    break;
                               
                            case 2: System.out.print("Masukan NIM mahasiswa yang dicari : ");
                                    String inputNim = kal.next();  
                                    System.out.print("\n===================================\n");
                                    ojk.SearchNim(inputNim);
                                    break;
                            case 3: System.out.print("Masukan IPK mahasiswa yang dicari : ");
                                    String inputIpk = kal.next();     
                                    System.out.print("\n===================================\n");
                                    ojk.SearchIpk(inputIpk);
                                    break;
                        }
                        break;
                   
                       
                case 5: System.out.print("good bye...we will come back\n");
                        System.exit(0);
                        break;
            }
        }while(inp==0);
    }
}
