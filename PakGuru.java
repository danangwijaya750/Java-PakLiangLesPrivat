import java.io.*;
public class PakGuru{
    BufferedReader bf;
    double[][] nilai = new double[4][3];
    double rataPelajaran[]= new double[4];
    double rataSiswa[]= new double[3];
    protected PakGuru() {
        bf= new BufferedReader(new InputStreamReader(System.in));
        renderDataln("=============Selamat Datang==============");
        renderDataln("==========================================");
        inputNilai();
        renderNilai();
    }
    void renderNilai(){
        PengolahNilai pNilai = new PengolahNilai(nilai);
        renderDataln("==============Pengolahan Nilai==============");
        renderDataln("============================================");
        rataPerpelajaran(pNilai);
        renderDataln("============================================");
        rataPersiswa(pNilai);
        renderDataln("============================================");
        renderDataln("rata-rata pelajaran Tertinggi : Pelajaran ke-"+(pNilai.getMaxRataValue(rataPelajaran)+1));
        renderDataln("============================================");
        renderDataln("rata-rata pelajaran Terendah : Pelajaran ke-"+(pNilai.getMinRataValue(rataPelajaran)+1));
        renderDataln("============================================");
        renderDataln("rata-rata Siswa Tertinggi : Siswa ke-"+(pNilai.getMaxRataValue(rataSiswa)+1));
        renderDataln("============================================");
        renderDataln("rata-rata Siswa Terendah : Siswa ke-"+(pNilai.getMinRataValue(rataSiswa)+1));
        renderDataln("============================================");
    }
    void rataPersiswa(PengolahNilai pNilai){
        for (int i = 0; i < 3; i++) {
            rataSiswa[i]=pNilai.getRataSiswa(i);
            renderDataln("rata-rata nilai Siswa ke-"+(i+1)+" "+rataSiswa[i]);
        }
    }
    void rataPerpelajaran(PengolahNilai pNilai){
        for (int i = 0; i < nilai.length; i++) {
            rataPelajaran[i]=pNilai.getRataPelajaran(i);
            renderDataln("rata-rata nilai pelajaran ke-"+(i+1)+" "+rataPelajaran[i]);
        }
    }
    void inputNilai(){
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                renderData("input nilai pelajaran ke-"+(i+1)+" siswa ke-"+(j+1)+" : ");
                try {
                    nilai[i][j]=Double.parseDouble(bf.readLine());
                } catch (Exception e) {
                    renderData(e.toString());
                }
            }
        }
    }
    void renderData(String data){
        System.out.print(data);
    }
    void renderDataln(String data){
        System.out.println(data);
    }

    public static void main(String[] args) {
        PakGuru pakGuru= new PakGuru();
    }

}