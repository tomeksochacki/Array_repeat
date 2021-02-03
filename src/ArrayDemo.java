class ArrayDemo {
    public static void main(String[] args) {
        int myTab[] = new int[10];
        int i, j, k;
        int max = myTab[0], min = myTab[0];

        for (i = 0; i < myTab.length; i++) {
            myTab[i] = i;
        }

        for (j = 0 ; j < myTab.length; j++) {
            System.out.print(myTab[j] + ", ");
        }

        for (k = 0; k<myTab.length; k++) {
            max = min = myTab[0];
            if (max < myTab[k]) max = myTab[k];
            if (min > myTab[k]) min = myTab[k];
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);


        int myTab2[] = {-99, 2, -100, 4, 87};
        int min2, max2;

        max2 = min2 = myTab2[0];
        for (int b=1; b<myTab2.length;b++){
            if (max2<myTab2[b]) max2 = myTab2[b];
            if (min2>myTab2[b]) min2 = myTab2[b];
        }
        System.out.println(max2);
        System.out.println(min2);
    }
}
