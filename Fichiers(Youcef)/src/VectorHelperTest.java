import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Une classe pour tester nos methodes
 * @author youcef bensid
 *
 */

public class VectorHelperTest {

	@Test
	public void testSommeVec() throws TailleException {
		int tab1[] = {1,1,6};
		int tab2[] = {2,1,1,5};
		int resultat[] = {3,2,7};
		assertArrayEquals(VectorHelper.SommeVec(tab1,tab2),null);
	
	}

	@Test
	public void testMinMax() 
	{
		int tab [] = {1,5,6,3};
		int resultat [] = {1,6};
		assertArrayEquals(VectorHelper.MinMax(tab),resultat);
		
	}

}
