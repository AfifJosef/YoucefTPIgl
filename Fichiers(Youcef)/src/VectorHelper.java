/**
 * 
 * @author youcef
 *
 */


public class VectorHelper 
{
	/**
	 * 
	 * @param tab1 le premier tableau pour la somme
	 * @param tab2 le deuxiemme
	 * @return un tableau de la meme taille que les tab1 et tab2 
	 * @throws TailleException si la taille de tab1 differe de la taille de tab2
	 */
	
    public static int [] SommeVec (int tab1[],int tab2[]) throws TailleException
    {
    	int i;
    	int resultat [] = new int [tab1.length];
    	if (tab1.length == tab2.length)
    	{
    	   for (i=0;i<tab1.length;i++)
    	      {
    		    resultat[i] = tab1[i] + tab2[i];
    	      }
    	}
    	else
    	{
    		//throw TailleException
    	}
    	return resultat;
    }
    /**
     * 
     * @param tab un tableau d'entiers
     * @return un tableau de deux cases: la premiere c'est le min, la deuxieme c'est le max
     */
    
    
    public static int [] MinMax (int tab[])
    {
    	int i;
    	int min = tab[0];
    	int max = tab[0];
    	for (i=1;i<tab.length;i++)
    	{
    		if (min > tab[i])
    		{
    			min = tab[i];
    		}
    		if (max < tab[i])
    		{
    			max = tab[i];
    		}
    	}
    	int minmax [] = new int [2];
    	minmax [0] = min;
    	minmax [1] = max;
    	return minmax;
    }
	
}
