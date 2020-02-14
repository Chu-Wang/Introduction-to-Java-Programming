package chapter07;

import sun.security.krb5.Confounder;

/**
 * @author WangMingMing
 * @creat 2020-02-13 21:20
 */
public class Exercise07_24 {
    public static void main(String[] args) {
        final int NUMBER_OF_CARDS = 52;
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        boolean[] fond = new boolean[4];

        int numberOfPicks = 0;
        int count = 0;
        while(count < 4){
            numberOfPicks++;
            int index = (int)(Math.random() * NUMBER_OF_CARDS);
            if(!fond[index / 13]){
                fond[index / 13] = true;
                count++;
                String suit = suits[index / 13];
                String rank = ranks[index % 13];
                System.out.println(rank + " of " + suit);
            }
        }
        System.out.println("Number of picks: " + numberOfPicks);

    }

}
