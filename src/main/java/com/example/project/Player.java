package com.example.project;

import java.util.ArrayList;


public class Player{
    private ArrayList<Card> hand;
    private ArrayList<Card> allCards; //the current community cards + hand
    String[] suits  = Utility.getSuits();
    String[] ranks = Utility.getRanks();
    int communAdd=0;
    
    public Player(){
        hand = new ArrayList<Card>();
        allCards= new ArrayList<Card>();
    }
        
        
    public ArrayList<Card> getHand(){return hand;}
    public ArrayList<Card> getAllCards(){return allCards;}

    public void addCard(Card c){
        hand.add(c);
        allCards.add(c);
    }

    public String playHand(ArrayList<Card> communityCards){  
        int pair=0;
        int three=0;
        int flu=0;
        int quad=0;
        boolean conseq=true;
        if(communAdd==0){
        for(int i=0; i<communityCards.size();i++){
            allCards.add(communityCards.get(i));
        }
        communAdd++;
    }
        sortAllCards();
        for(int i=0; i<allCards.size()-1;i++){
            if(Utility.getRankValue(allCards.get(i).getRank())+1!=Utility.getRankValue(allCards.get(i+1).getRank())){
                conseq=false;
            }
        }
        for(int i=0;i<findSuitFrequency().size();i++){
            if(findSuitFrequency().get(i)>=5){
                flu++;
            }
        }
       
        for(int i=0; i<findRankingFrequency().size();i++){
            if(findRankingFrequency().get(i)==2){
                pair++;
            }
            if(findRankingFrequency().get(i)==3){
                three++;
            }
            if(findRankingFrequency().get(i)==4){
                quad++;
            }
        }
      
 
        if(conseq==true && allCards.get(0).getRank().equals("10") && flu>=1){
            return "Royal Flush";
        }
        else{
        if(conseq==true&& flu>=1){
            return "Straight Flush";
        }
        else{
        if(quad>=1){
            return "Four of a Kind";
        }
        else{
        if(pair==1&&three==1){
            return "Full House";
        }
        else{
        if(flu>=1){
            return "Flush";
        }
        else{
        if(conseq==true){
            return "Straight";
        }
        else{
        if(three>=1){
            return "Three of a Kind";
        }
        else{
        if(pair==2){
            return "Two Pair";
        }
        else{
        if(pair==1){
            return "A Pair";
        }
        else{
        if(Utility.getRankValue(hand.get(hand.size()-1).getRank())>Utility.getRankValue(communityCards.get(communityCards.size()-1).getRank())){
        return "High Card";
         }
         else{
         if(Utility.getRankValue(hand.get(hand.size()-1).getRank())<Utility.getRankValue(communityCards.get(communityCards.size()-1).getRank())){
        return "Nothing";
         }
         else{
            return null;
         }
         }
        }
    }
    }
    }
    }   
    }
    }
    }
    }
    }

<<<<<<< HEAD
    public void sortAllCards(){
        Card place;
        for(int i=0; i<hand.size();i++){
            while(i-1>=0&&Utility.getRankValue(hand.get(i).getRank())<Utility.getRankValue(hand.get(i-1).getRank())){
               place= hand.get(i-1);
               hand.set(i-1, hand.get(i));
               hand.set(i, place);
               i=1;
            }
        }
        for(int i=0; i<allCards.size();i++){
            while(i-1>=0&&Utility.getRankValue(allCards.get(i).getRank())<Utility.getRankValue(allCards.get(i-1).getRank())){
               place= allCards.get(i-1);
               allCards.set(i-1, allCards.get(i));
               allCards.set(i, place);
               i=1;
            }
        }
    } 
=======
    public void sortAllCards(){} 
>>>>>>> cc680aeaf2632ef74e6e22726e31cbd58dccdef7

    public ArrayList<Integer> findRankingFrequency(){
    ArrayList<Integer> freq= new ArrayList<>();        
    for(int i=0; i<14;i++){
        freq.add(0);
    }
        for(int i=0; i<allCards.size();i++){
            if(allCards.get(i).getRank().equals("2")){
                freq.set(0,freq.get(0)+1);
            }if(allCards.get(i).getRank().equals("3")){
                freq.set(1,freq.get(1)+1);
            }if(allCards.get(i).getRank().equals("3")){
                freq.set(2,freq.get(2)+1);
            }if(allCards.get(i).getRank().equals("4")){
                freq.set(3,freq.get(3)+1);
            }if(allCards.get(i).getRank().equals("5")){
                freq.set(4,freq.get(4)+1);
            }if(allCards.get(i).getRank().equals("6")){
                freq.set(5,freq.get(5)+1);
            }if(allCards.get(i).getRank().equals("7")){
                freq.set(6,freq.get(6)+1);
            }if(allCards.get(i).getRank().equals("8")){
                freq.set(7,freq.get(7)+1);
            }if(allCards.get(i).getRank().equals("9")){
                freq.set(8,freq.get(8)+1);
            }if(allCards.get(i).getRank().equals("10")){
                freq.set(9,freq.get(9)+1);
            }if(allCards.get(i).getRank().equals("J")){
                freq.set(10,freq.get(10)+1);
            }if(allCards.get(i).getRank().equals("Q")){
                freq.set(11,freq.get(11)+1);
            }if(allCards.get(i).getRank().equals("K")){
                freq.set(12,freq.get(12)+1);
            }if(allCards.get(i).getRank().equals("A")){
                freq.set(13,freq.get(13)+1);
            }
        }
        return freq; 
    }

    public ArrayList<Integer> findSuitFrequency(){
        ArrayList<Integer> freq= new ArrayList<>();  
        for(int i=0; i<4;i++){
            freq.add(0);
        }
        for(int i=0; i<allCards.size();i++){
            if(allCards.get(i).getSuit().equals("♠")){
                freq.set(0,freq.get(0)+1);}
            if(allCards.get(i).getSuit().equals("♥")){
                freq.set(1,freq.get(1)+1);
            }if(allCards.get(i).getSuit().equals("♣")){
                freq.set(2,freq.get(2)+1);
            }if(allCards.get(i).getSuit().equals("♦")){
                freq.set(3,freq.get(3)+1);
            }
        }
        
        return freq; 
    }

   
    @Override
    public String toString(){
        return hand.toString();
    }

}
