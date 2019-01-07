import java.io.*;
public class PakGuru{
    //. deklarasi variable yang digunakan
    BufferedReader bf;
    double[][] nilai = new double[4][3];
    double rataPelajaran[]= new double[4];
    double rataSiswa[]= new double[3];
    //. method constructor class ini agar bisa di run di method main
    protected PakGuru() {
        bf= new BufferedReader(new InputStreamReader(System.in));
        renderDataln("=============Selamat Datang==============");
        renderDataln("==========================================");
        //. memanggil method inputNilai
        inputNilai();
        //. memanggil method renderNilai
        renderNilai();
    }
    //. method renderNilai untuk mencetak Nilai Siswa yang telah diinputkan
    void renderNilai(){
        //. membuat object pNilai dari class PengolahNilai
        PengolahNilai pNilai = new PengolahNilai(nilai);
        //. mendapatkan rata-rata nilai pelajaran
        rataPerpelajaran(pNilai);
        //. mendapatkan rata-rata nilai siswa
        rataPersiswa(pNilai);
        renderDataln("");
        renderDataln("==============Pengolahan Nilai==============");
        renderDataln("============================================");
        //. memanggil method renderDataAll
        renderDataAll();
        renderDataln("============================================");
        //. mencetak pelajaran dengan rata-rata nilai tertinggi
        renderDataln("rata-rata pelajaran Tertinggi : Pelajaran ke-"+(pNilai.getMaxRataValue(rataPelajaran)+1));
        renderDataln("============================================");
        //. mencetak pelajaran dengan rata-rata nilai terendah
        renderDataln("rata-rata pelajaran Terendah : Pelajaran ke-"+(pNilai.getMinRataValue(rataPelajaran)+1));
        renderDataln("============================================");
        //. mencetak siswa dengan rata-rata nilai tertinggi
        renderDataln("rata-rata Siswa Tertinggi : Siswa ke-"+(pNilai.getMaxRataValue(rataSiswa)+1));
        renderDataln("============================================");
        //. mencetak pelajaran dengan rata-rata nilai tertinggi
        renderDataln("rata-rata Siswa Terendah : Siswa ke-"+(pNilai.getMinRataValue(rataSiswa)+1));
        renderDataln("============================================");
    }
    //. method rataPersiswa untuk mendapatkan nilai rata-rata persiswa
    void rataPersiswa(PengolahNilai pNilai){
        for (int i = 0; i < 3; i++) {
            rataSiswa[i]=pNilai.getRataSiswa(i);
        }
    }
    //. method renderDataAll untuk mecetak seluruh data dengan format seperti tabel
    void renderDataAll(){
        System.out.printf("%10s %20s %5s %5s %5s %5s", "Siswa", "Pelajaran-1", "Pelajaran-2", "Pelajaran-3", "Pelajaran-4","Rata-rata");
        renderDataln("");renderDataln("-----------------------------------------------------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%10s %20s %10s %10s %10s %10s", "Siswa ke-"+(i+1)+"", ""+nilai[0][i]+"", ""+nilai[1][i]+"", ""+nilai[2][i]+"", ""+nilai[3][i]+"",""+rataSiswa[i]+"");
            renderDataln("");
            }
        renderDataln("-----------------------------------------------------------------------------------------------");
        System.out.printf("%10s %10s %10s %10s %10s %10s", "Rata-rata Pelajaran",  ""+rataPelajaran[0]+"", ""+rataPelajaran[1]+"", ""+rataPelajaran[2]+"", ""+rataPelajaran[3]+"","-");
        renderDataln("");renderDataln("-----------------------------------------------------------------------------------------------");
    }
     //. method rataPersiswa untuk mendapatkan nilai rata-rata per-pelajaran
    void rataPerpelajaran(PengolahNilai pNilai){
        for (int i = 0; i < nilai.length; i++) {
            rataPelajaran[i]=pNilai.getRataPelajaran(i);
        }
    }
    //. method inputNilai untuk memberikan input data nilai melalui Keyboard
    void inputNilai(){
        for (int i = 0; i < nilai.length; i++) {
            renderDataln("input nilai pelajaran ke-"+(i+1)+"");
            for (int j = 0; j < nilai[i].length; j++) {
                renderData("nilai siswa ke-"+(j+1)+" : ");
                try {
                    nilai[i][j]=Double.parseDouble(bf.readLine());
                } catch (Exception e) {
                    renderData(e.toString());
                }
            }
        }
    }
     //. method renderData untuk mecetak data String
    void renderData(String data){
        System.out.print(data);
    }
    //. method renderDataln untuk mecetak data String lalu berganti baris
    void renderDataln(String data){
        System.out.println(data);
    }
    //. main method agar program bisa di-jalankan
    public static void main(String[] args) {
        PakGuru pakGuru= new PakGuru();
    }

}