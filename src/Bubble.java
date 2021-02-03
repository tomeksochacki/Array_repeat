class Bubble {
    public static void main(String[] args) {
        int myTabThree[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size;
        size = 10;
        System.out.println("Array:");
        for (int i = 0; i<myTabThree.length; i++){
            System.out.print(myTabThree[i] + " ");
        }
        System.out.println();

        for (a = 1; a<myTabThree.length; a++){
            for (b=myTabThree.length-1; b>=a; b--){
                if (myTabThree[b-1]>myTabThree[b]){
                    t = myTabThree[b-1];
                    myTabThree[b-1] = myTabThree[b];
                    myTabThree[b] = t;
                }
            }
        }

        System.out.println("Array sorted:");
        for (int g = 0; g<myTabThree.length; g++){
            System.out.print(myTabThree[g] + " ");
        }

    }
}
