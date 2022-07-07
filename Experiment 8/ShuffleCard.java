import java.lang.Math;
interface RankT
{
    int[] rankT = {2,3,4,5,6,7,8,9,10,74,81,75,65};
    
    int ctr1 = 4;
    int ctr2 = 0;
    int ctrs = 0;

}
interface SuitT
{
    char[] suitT = {'H','C','S','D'};
}
class CardT implements RankT,SuitT
{
    int k=1;
    void ShuffleDeck()
    {
        while(k!=53)
        {
            int rank_ind = (int)((Math.random()*13));
            int suit_ind = (int)((Math.random()*4));


            if(rankT[rank_ind] > 10)
            {
                System.out.print((char)(rankT[rank_ind])+""+(suitT[suit_ind])+"\t");
            }
            else
            {
                System.out.print((rankT[rank_ind])+""+(suitT[suit_ind])+"\t");
            }
            if(k % 13==0)
                System.out.println("\n");
            k++;
        }
    }
    boolean cardcheck(int x,int y)
    {
        if(x==1)
        {
            RankT.ctr1--;
            if(ctr1==0)
                return false;
            else
                return true;
        }
        else
            return false;
    }
}
public class ShuffleCard 
{
    public static void main(String[] args)
    {
        CardT card = new CardT();
        card.ShuffleDeck();
    }    
}
