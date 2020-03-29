package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Ordering ord = new Ordering();
        Pick pick = new Pick();

        int[] sir = new int[6];

        pick.randomPick(sir);
        ord.ascendingOrder(sir);
        System.out.print("Numerele extrase aleatoriu, ordonate crescator sunt: ");
        for(int i = 0; i < 6; i++) {
            System.out.print(sir[i]+" ");
        }
    }
}
