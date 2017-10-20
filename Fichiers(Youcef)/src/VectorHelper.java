package tpIgl;
/**
 * 
 * 		Ce TP a pour but de nous permettre de s�impr�gner des outils de g�nie logiciel
 * 	et notamment, la gestion du code source et des versions, la gestion de la documentation et les tests
 * 	unitaires.
 * @author Mouloud
 * @version 3.0
 */

/**
 * 	Importation de la calsse Arrays dont on utilisera la m�thode copyOf(int origine,int length) qui retourne
 * 	une copie du tableau origine.
 */
import java.util.Arrays;

/**
 * <p>
 *  La classe VectorHelper definit un ensemble de m�thodes de manipulation des tableaux.
 *  <ul>
 *  <li>Trier les �l�ments d�un vecteur</li>
 *   <li>Sommer deux vecteurs. Elle doit g�n�rer une exception si les deux vecteurs ont des tailles diff�rentes</li>
 *   <li>Inverser les �l�ments d�un vecteur</li>
 *   <li>Obtenir simultan�ment le minimum et le maximum d�un vecteur</li>
 *   <li>Appliquer une formule sous forme de fonction � tous les �l�ments d�un vecteur.Cette formule est le "modulo".</li>
 *   </ul>
 *   </p>
 * @author Mouloud
 *
 */

public class VectorHelper {
	/**
	 * <p>
	 * sortTable tri un vecteur "tableau" selon la m�thode du trie bulle
	 * Par definition Le tri � bulles ou tri par propagation1 est un algorithme de tri.
	 *  Il consiste � comparer r�p�titivement les �l�ments cons�cutifs d'un tableau, 
	 *  et � les permuter lorsqu'ils sont mal tri�s.Il doit son nom au fait qu'il d�place rapidement 
	 *  les plus grands �l�ments en fin de tableau, comme des bulles d'air qui remonteraient rapidement � la surface
	 *  d'un liquide.Le tri � bulles est souvent enseign� en tant qu'exemple algorithmique, car son principe est simple. 
	 *  Mais c'est le plus lent des algorithmes de tri commun�ment enseign�s, et il n'est donc gu�re utilis� en pratique.
	 *  </p>
	 * @param tableau un vecteur d'entier
	 * @return un tableau tri�
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
	 * <p>revserseTable est une m�thode qui inverse les �l�ments d'un vecteur. </p>
	 * @param tableau un tableau d'entier
	 * @return un tableau dont les �l�ments sont invers�s 
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
	 * @param n un entier repr�sentant le diviseur
	 * @return k mod n
	 */
	
	public static int fonctionMod(int k, int n){
		return k%n;
	}
	
	/**
	 * <p>fonctionVector est une m�thode qui applique la fonction "fonctionMod" aux �l�ments d'un vecteur</p>
	 * @see fonctionMod 
	 * @param tableau un tableau d'entier
	 * @param n un entier repr�sentant le diviseur
	 * @return un vecteur d'entiers inf�rieur strictement � n
	 */
	public static int[] fonctionVector(int[] tableau, int n){
		int[] result=Arrays.copyOf(tableau, tableau.length);
		for(int i=0;i<result.length;i++){
			result[i]=fonctionMod(result[i],n);
		}
		return result;
	}
	
}
