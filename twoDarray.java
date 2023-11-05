public class twoDarray {
    public static void main(String[] args) {
        int A[][] = new int[5][5];
        int B[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        /*
         * for(int i=0;i<B.length;i++){
         * for(int j=0;j<B[0].length;j++){
         * System.out.print (B[i][j]+" ");
         * 
         * }
         * System.out.println("");
         * }
         */
        for (int x[] : B) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }
        // for array A same matrix will produce with ony 0, as we dont assign any
        // values.
    }

}
