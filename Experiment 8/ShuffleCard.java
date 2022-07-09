import java.util.*;
interface RankT
{
	void CardName();
    void genCard();
    void ShuffleDeck();
    List<String> rankT = new ArrayList<>();
}
interface SuitT
{
	void CardName();
	void genCard();
	void ShuffleDeck();
	List<String> suitT = new ArrayList<>();
}
interface CardT
{
	void CardName();
	void genCard();
	void ShuffleDeck();
	List<String> Card = new ArrayList<>();
}
class GetCard implements RankT,SuitT,CardT
{
    public void genCard()
    {
    	Collections.addAll(rankT,"A","2","3","4","5","6","7","8","9","10","J","Q","K");
    	Collections.addAll(suitT,"H","C","S","D");
    }
    public void CardName()
    {
    	for(int i=0;i<4;i++)
    		for(int j=0;j<13;j++)
				Card.add(rankT.get(j) + suitT.get(i));
    }
    public void ShuffleDeck()
    {
    	Collections.shuffle(Card);
    	System.out.println("The shuffled deck of 52 cards is:");
    	for(int i=0;i<Card.size();i++)
    	{
    		if(i%13==0 && i!=0)
    			System.out.print("\n");
    		System.out.print(Card.get(i)+"\t");
    	}
    	System.out.print("\n");
    }
}
public class ShuffleCard 
{
    public static void main(String[] args)
    {
        GetCard card = new GetCard();
        card.genCard();
        card.CardName();
        card.ShuffleDeck();
    }    
}
