package tpIgl;
/**
 * 
 * 		Ce TP a pour but de nous permettre de s’imprégner des outils de génie logiciel
 * 	et notamment, la gestion du code source et des versions, la gestion de la documentation et les tests
 * 	unitaires.
 * @author Mouloud
 * @version 3.0
 */

/**
 * 	Importation de la calsse Arrays dont on utilisera la méthode copyOf(int origine,int length) qui retourne
 * 	une copie du tableau origine.
 */
import java.util.Arrays;

/**
 * <p>
 *  La classe VectorHelper definit un ensemble de méthodes de manipulation des tableaux.
 *  <ul>
 *  <li>Trier les éléments d’un vecteur</li>
 *   <li>Sommer deux vecteurs. Elle doit générer une exception si les deux vecteurs ont des tailles différentes</li>
 *   <li>Inverser les éléments d’un vecteur</li>
 *   <li>Obtenir simultanément le minimum et le maximum d’un vecteur</li>
 *   <li>Appliquer une formule sous forme de fonction à tous les éléments d’un vecteur.Cette formule est le "modulo".</li>
 *   </ul>
 *   </p>
 * @author Mouloud
 *
 */

public class VectorHelper {
	/**
	 * <p>
	 * sortTable tri un vecteur "tableau" selon la méthode du trie bulle
	 * Par definition Le tri à bulles ou tri par propagation1 est un algorithme de tri.
	 *  Il consiste à comparer répétitivement les éléments consécutifs d'un tableau, 
	 *  et à les permuter lorsqu'ils sont mal triés.Il doit son nom au fait qu'il déplace rapidement 
	 *  les plus grands éléments en fin de tableau, comme des bulles d'air qui remonteraient rapidement à la surface
	 *  d'un liquide.Le tri à bulles est souvent enseigné en tant qu'exemple algorithmique, car son principe est simple. 
	 *  Mais c'est le plus lent des algorithmes de tri communément enseignés, et il n'est donc guère utilisé en pratique.
	 *  </p>
	 * @param tableau un vecteur d'entier
	 * @return un tableau trié
	 */
	
	public static int[] sortTable(int [] tableau){
		boolean stop=false;
		int[] result;
		result= Arrays.copyOf(tableau,tableau.length);
		int i=0,intermediaire;
		while( !stop ){
			i=0;
			while(i< (result.length-1)){
				stop=true;
				if(result[i]>result[i+1]){
					intermediaire=result[i];
					result[i]=result[i+1];
					result[i+1]=intermediaire;
					stop=false;
				}
				i++;
			}
		}
		return result;
	}
	/**
	 * <p>revserseTable est une méthode qui inverse les éléments d'un vecteur. </p>
	 * @param tableau un tableau d'entier
	 * @return un tableau dont les éléments sont inversés 
	 */
	public static int[] reverseTable(int[] tableau){
		int intermediaire;
		int[] result=Arrays.copyOf(tableau, tableau.length);
		for(int i=0;i<result.length/2;i++){
			intermediaire=result[result.length-(i+1)];
			result[result.length-(i+1)]=result[i];
			result[i]=intermediaire;
			
		}
		return result;
	}
	
	/**
	 * 
	 * @param k un entier dont on va lui appliquer la fonction 
	 * @param n un entier représentant le diviseur
	 * @return k mod n
	 */
	
	public static int fonctionMod(int k, int n){
		return k%n;
	}
	
	/**
	 * <p>fonctionVector est une méthode qui applique la fonction "fonctionMod" aux éléments d'un vecteur</p>
	 * @see fonctionMod 
	 * @param tableau un tableau d'entier
	 * @param n un entier représentant le diviseur
	 * @return un vecteur d'entiers inférieur strictement à n
	 */
	public static int[] fonctionVector(int[] tableau, int n){
		int[] result=Arrays.copyOf(tableau, tableau.length);
		for(int i=0;i<result.length;i++){
			result[i]=fonctionMod(result[i],n);
		}
		return result;
	}
	
}
