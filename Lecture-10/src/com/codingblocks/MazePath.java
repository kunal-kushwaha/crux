package com.codingblocks;

public class MazePath {

    public static void main(String[] args) {

        int row = 10;
        int col = 10;

        long[][] mem = new long[row+1][col+1];
        long[] mem2 = new long[col+1];

//        Long[][] mem = new Long[row+1][col+1];      // Long is wrapper, default value null. null point error.

        System.out.println(mazecountDP(row, col, mem));

        System.out.println(mazeCountItrDPSS(row, col, mem2));

//        System.out.println(mazecount(row, col));

//        System.out.println(mazeCountItrDP(row, col, mem));

    }

    public static int mazecount(int row, int col){  // will fail for large data

        if(row == 1 || col == 1){
            return 1;
        }

        int r1 =  mazecount(row-1, col);
        int r2 = mazecount(row, col-1);
        return r1 + r2;

    }

    public static long mazecountDP(int row, int col, long[][] mem){

        if(row == 1 || col == 1){
            return 1;
        }

        if(mem[row][col] != 0) {
            return mem[row][col];
        }

        long r1 =  mazecountDP(row-1, col,mem);
        long r2 = mazecountDP(row, col-1,mem);

        mem[row][col] = r1 + r2;

        return mem[row][col];
    }

    public static long mazeCountItrDP(int row, int col, long[][] mem){

        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {

                if(r == 1 || c == 1){
                    mem[r][c] = 1;
                }else{
                    mem[r][c] = mem[r-1][c] + mem[r][c-1];
                }
            }
        }
        return(mem[row][col]);
    }

    // Short Storage
    // Linear Space
    public static long mazeCountItrDPSS(int row, int col, long[] mem){

        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {

                if(r == 1 || c == 1){
                    mem[c] = 1;
                }else{
                    mem[c] += mem[c-1];
                }
            }
        }
        return(mem[col]);
    }

}
