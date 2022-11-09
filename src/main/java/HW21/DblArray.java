package HW21;

public class DblArray {
    public int[][] dblArrays;

    public DblArray(int[][] dblArrays) {
        this.dblArrays = dblArrays;

    }
    public void seeArray(){
        for (int i = 0; i < dblArrays.length; i++) {
            for (int j = 0; j < dblArrays.length; j++) {
                System.out.print(" " + dblArrays[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void checkArrays() {
        int rows = dblArrays.length;
        int columns = dblArrays[0].length;
        if(rows == columns){
            System.out.println("Kvadrat");
        }else{
            System.out.println("ne Kvadrat");
        }
    }
}
