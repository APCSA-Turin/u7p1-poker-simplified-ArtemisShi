package com.example.project;


import java.util.ArrayList;

class test {
public static void main(String[] args) {
    Player player1 = new Player();
    Player player2 = new Player();
    
    // Player 1 has Three of a Kind: 3 Jacks
    player1.addCard(new Card("J", "♠"));
    player1.addCard(new Card("J", "♣"));
    
    // Player 2 has Four of a Kind: 4 Tens
    player2.addCard(new Card("10", "♠"));
    player2.addCard(new Card("10", "♣"));
    
    ArrayList<Card> communityCards = new ArrayList<>();
    communityCards.add(new Card("10", "♦"));
    communityCards.add(new Card("10", "♥"));
    communityCards.add(new Card("J", "♠"));
    
    String p1Result = player1.playHand(communityCards);
    String p2Result = player2.playHand(communityCards);
    
    // String winner = Game.determineWinner(player1, player2, p1Result, p2Result, communityCards);
    // System.out.println(winner);
    System.out.println(p1Result);
    System.out.println(p2Result);
}
    
}