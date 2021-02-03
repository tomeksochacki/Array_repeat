class ArrayDemoTwo {
    public static void main(String[] args) {
        int table[][] = new int[10][20];
        int i, t;
        for(t = 0; t<3; t++){
            for (i=0; i<4; i++){
                table[t][i] = (4*t)+i+1;
                System.out.println(table[t][i]);
            }
            System.out.println();
        }

        int table2[][] = new int[4][];
        table2[0] = new int[2];
        table2[1] = new int[1];
        table2[2] = new int[6];
        table2[3] = new int[9];


    }
}
