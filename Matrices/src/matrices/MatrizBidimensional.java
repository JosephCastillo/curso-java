package matrices;

public class MatrizBidimensional {

    
    
    
    public void miMatrix() {
        int[][] matrix = new int[4][5];

        matrix[0][0] = 23;
        matrix[0][1] = 43;
        matrix[0][2] = 23;
        matrix[0][3] = 42;
        matrix[0][4] = 32;

        matrix[1][0] = 24;
        matrix[1][1] = 432;
        matrix[1][2] = 56;
        matrix[1][3] = 75;
        matrix[1][4] = 76;

        matrix[2][0] = 456;
        matrix[2][1] = 45;
        matrix[2][2] = 345;
        matrix[2][3] = 65;
        matrix[2][4] = 35;

        matrix[3][0] = 436;
        matrix[3][1] = 65;
        matrix[3][2] = 76;
        matrix[3][3] = 45;
        matrix[3][4] = 65;

        

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(" matrix: " + matrix[i][j]);
            }
        }
        
    }

}
