package tpIgl;

import static org.junit.Assert.*;
/**
 * Tests Unitaires
 * Cette classe a pour objectif de tester les méthodes de la classe VectorHelper
 * @author Mouloud
 * @since 2.0
 *
 */

import org.junit.Test;

import tpIgl.VectorHelper;

public class VectorHelperTest {

	@Test
	public void testSortTable() {
		int[] tableau={6,1,-100,1,18,13};
		int[] resultatAttendu={-100,1,1,6,13,18};
		int[] resultatObtenu;
		resultatObtenu=VectorHelper.sortTable(tableau);
		assertArrayEquals(resultatAttendu,resultatObtenu);
		
	}

	@Test
	public void testReverseTable() {
		int[] tableau={6,1,-100,18,13};
		int[] resultatAttendu={13,18,-100,1,6};
		int[] resultatObtenu;
		resultatObtenu= VectorHelper.reverseTable(tableau);
		assertArrayEquals(resultatAttendu,resultatObtenu);
		
	}

	@Test
	public void testFonctionVector() {
		int[] tableau = {4,9,10,17,5,19};
		int[] resultatAttendu = {1,0,1,2,2,1};
		int[] resultatObtenu;
		int n=3;
		resultatObtenu= VectorHelper.fonctionVector(tableau, n);
		assertArrayEquals(resultatAttendu,resultatObtenu);
		
	}

}
