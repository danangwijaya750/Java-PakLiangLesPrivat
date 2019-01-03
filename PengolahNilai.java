public class PengolahNilai{
    double[][] nilai;
    public PengolahNilai(double nilai[][]) {
        this.nilai=nilai;
    }

    public void printNilai(int row,int col){
        renderData(""+nilai[row][col]);
    }
    void renderData(String data){
        System.out.println(data);
    }
    double getRataPelajaran(int row){
        double result=0;
        result=(nilai[row][0]+nilai[row][1]+nilai[row][2])/nilai[row].length;
        return result;
    }
    double getRataSiswa(int col){
        double result=0;
        result=(nilai[0][col]+nilai[1][col]+nilai[2][col]+nilai[3][col])/nilai.length;
        return result;
    }
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