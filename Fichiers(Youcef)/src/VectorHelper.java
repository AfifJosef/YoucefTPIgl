

public class VectorHelper 
{
	
	
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
