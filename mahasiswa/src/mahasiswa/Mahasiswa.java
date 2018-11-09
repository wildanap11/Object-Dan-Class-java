//class mahasiswa
package utama;

/**
 *
 * @author Wildanap
 */
public class mahasiswa {
    private String nim;
    private String nama;
    private double ipk;
    private int ind;
   

    public mahasiswa(){
        nim = "";
        nama = "";
        ipk = 0.00;
        ind = 0;
    }

    public String getNIM(){
        return nim;
    }

    public String getNAMA(){
        return nama;
    }

    public double getIPK(){
        return ipk;
    }

    public int getIND(){
        return ind;
    }

    public void setNIM(String nim){
        this.nim = nim;
    }

    public void setNAMA(String nama){
        this.nama = nama;
    }

    public void setIPK(double ipk){
        this.ipk = ipk;
    }

    public void setIND(int ind){
        this.ind = ind;
    }
}
