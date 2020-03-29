package com.company;
import java.util.Random;

public class Pick {

    public void randomPick(int[] sir) {
        int gasit = 1, temp;
        Random rand = new Random();

        for(int i = 0; i < 6; i++) {
            gasit = 1;
            while(gasit == 1) {
                gasit = 0;
                temp = rand.nextInt(49);
                for(int j = 0; j < i; j++) {
                    if(temp == sir[j]) {
                        gasit = 1;
                    }
                }
                sir[i] = temp;
            }
        }
    }
}
