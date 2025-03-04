package com.example.project;
import java.util.ArrayList;


public class Game{
    public static String determineWinner(Player p1, Player p2,String p1Hand, String p2Hand,ArrayList<Card> communityCards){
      if(Utility.getHandRanking(p1Hand)>Utility.getHandRanking(p2Hand)){
        return "Player 1 wins!";
      }
      if(Utility.getHandRanking(p1Hand)<Utility.getHandRanking(p2Hand)){
        return "Player 2 wins!";
      }
      if(Utility.getHandRanking(p1Hand)==Utility.getHandRanking(p2Hand)){
        if(Utility.getRankValue(p1.getHand().get(p1.getHand().size()-1).getRank())>Utility.getRankValue(p2.getHand().get(p2.getHand().size()-1).getRank())){
            return "Player 1 wins!"; 
        }
        if(Utility.getRankValue(p1.getHand().get(p1.getHand().size()-1).getRank())<Utility.getRankValue(p2.getHand().get(p2.getHand().size()-1).getRank())){
            return "Player 2 wins!";
        }
        else{
            return "Tie!";
        }
      }

        return "Error";
    }

    public static void play(){ //simulate card playing
    
    }
        
        

}