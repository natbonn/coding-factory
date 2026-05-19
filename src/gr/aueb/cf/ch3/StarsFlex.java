package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν θετικό ακέραιο, έστω n,
 * και εκτυπώνονται τόσα αστεράκια οριζόντια,
 * όσα ο αριθμός n που εισήγαγε ο χρήστης.
 */

public class StarsFlex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int i = 1;
    int n = 0;

        System.out.println("Παρακαλώ εισάγετε έναν θετικό ακέραιο: ");
        n = in.nextInt();

        while (i <= n) {
            System.out.print("*");
            i++;  //i γίνεται i+1 (αυτό σημαίνει το ++)
        }
    }
}
