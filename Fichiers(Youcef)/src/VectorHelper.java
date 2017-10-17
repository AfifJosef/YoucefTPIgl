/**
 * Cette classe a des methodes statiques qui font des manipulations sur des vecteurs
 * @author youcef bensid
 *
 */

public class VectorHelper 
{
	/**
	 * 
	 * @param tab1 un tableau d'entiers
	 * @param tab2 un tableau d'entiers
	 * @return un tableau d'entiers de meme taille que tab1 et tab2, tout element de la case i 
	 * de ce tableau est egale a la somme de la case i de tab1 et tab2
	 * @throws TailleException si tab1 et tab2 ont des tailles différentes
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
    		Exception e = new TailleException();
    	}
    	return resultat;
    }
    
    /**
     * 
     * @param tab un tableau d'entiers
     * @return un tableau d'entiers qui a deux cases :
     * la premiere est le minimum de tab
     * la deuxieme est le maximum de tab 
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
