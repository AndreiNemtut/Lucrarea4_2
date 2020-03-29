package com.company;

public class Ordering {

    public void ascendingOrder(int[] sir) {
        int i, j, k, x;
        for(i = 0; i < 5; i++) {
            k = i;
            x = sir[i];
            for (j = i + 1; j < 6; j++)
                if (sir[j] < x) {
                    x = sir[j];
                    k = j;
                }
            sir[k] = sir[i];
            sir[i] = x;
        }

    }

}
