package com.game123;
import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to Snake and Ladder Game!");
        System.out.print("Select number of player from 1 to 4: ");
        int numPlayer = console.nextInt();
        if (numPlayer <1) {
            System.out.print("Select number of player from 1 to 4: ");
            numPlayer = console.nextInt();
        }else{
            for (int i = 0; i < numPlayer; i++){
                Players a = new Players();
            }
        }
    }
}
