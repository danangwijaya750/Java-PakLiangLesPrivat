public class PengolahNilai{
    double[][] nilai;
    //. constructor
    public PengolahNilai(double nilai[][]) {
        this.nilai=nilai;
    }
    //. mendapatkan nilai rata-rata pelajaran
    double getRataPelajaran(int row){
        double result=0;
        double temp = Math.pow(10, 2);
        result=(nilai[row][0]+nilai[row][1]+nilai[row][2])/nilai[row].length;
        result = (double) Math.round(result*temp)/temp;
        return result;
    }
    //. mendapatkan nilai rata-rata siswa
    double getRataSiswa(int col){
        double result=0;
        double temp = Math.pow(10, 2);
        result=(nilai[0][col]+nilai[1][col]+nilai[2][col]+nilai[3][col])/nilai.length;
        result = (double) Math.round(result*temp)/temp;
        return result;
    }
    //. mendaptkan pemilik rata-rata tertinggi
    int getMaxRataValue(double rata[]){
        int result=0;
        double maxVal=rata[0];
        for (int i = 0; i < rata.length; i++) {
            if (rata[i]>maxVal) {
                maxVal=rata[i];
                result=i;
            }
        }
        return result;
    }
    //. mendaptkan pemilik rata-rata terendah
    int getMinRataValue(double rata[]){
        int result=0;
        double minVal=rata[0];
        for (int i = 0; i < rata.length; i++) {
            if (rata[i]<minVal) {
                minVal=rata[i];
                result=i;
            }
        }
        return result;
    }


}