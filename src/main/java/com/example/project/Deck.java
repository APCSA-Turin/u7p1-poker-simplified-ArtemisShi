package com.example.project;
import java.util.ArrayList;
import java.util.Collections;

public class Deck{
    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        initializeDeck();
        shuffleDeck();
    }

    public ArrayList<Card> getCards(){
        return cards;
    }

    public  void initializeDeck(){ //hint.. use the utility class
        for(int i=0; i<Utility.getSuits().length;i++){
            for(int j=0; j<Utility.getRanks().length;j++){
                cards.add(new Card(Utility.getRanks()[j],Utility.getSuits()[i]));
            }
        }
    }

    public  void shuffleDeck(){ //You can use the Collections library or another method. You do not have to create your own shuffle algorithm
        Collections.shuffle(cards);
    }

    public Card drawCard(){
        Card place;
        if(!isEmpty()){
        place = cards.get(0);
            cards.remove(0);
        }
        else{
            return null;
        }
       return place;
    }

    public  boolean isEmpty(){
        return cards.isEmpty();
    }

   


}