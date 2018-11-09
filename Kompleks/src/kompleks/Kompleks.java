/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utama;

/**
 *
 * @author Wildanap
 */
public class Kompleks {
    mahasiswa[] data;
    private int index;
    private int x;
   
   
    mahasiswa dt = new mahasiswa();
    public Kompleks(){
        data = new mahasiswa[100];
    }
   
    public void get(int ind){
                                System.out.println("NIM   : "+data[ind].getNIM());
                                System.out.println("Nama  : "+data[ind].getNAMA());
                                System.out.println("IPK   : "+data[ind].getIPK());
                System.out.print("\n=====================\n");
                }
   
    public void set(int index, mahasiswa datuk){
        data[index] = datuk;
    }

    public int getINDEX(){
        return index;
    }
   
    public void setINDEX(int index){
        this.index = index;
    }
  
    public void SearchNim(String nm){
        int a = getINDEX();
        for(int i = 0; i<a; i++){
            if(nm.equals(data[i].getNIM())){
                get(i);
            }           
        }
    }
   
    public void SearchNama(String nm){
        int a = getINDEX();
        for(int i = 0; i<a; i++){
            if(nm.equals(data[i].getNAMA())){
                get(i);
            }           
        }
    }
   
    public void SearchIpk(String ip){
        int a = getINDEX();
        for(int i = 0; i<a; i++){
            if(ip.equals(data[i].getIPK())){
                get(i);
            }            
        }
    }   
}
