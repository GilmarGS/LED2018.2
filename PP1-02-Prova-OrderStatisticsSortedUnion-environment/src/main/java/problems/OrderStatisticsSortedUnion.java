package problems;

/**
 * Dado dois arrays ordenados em ordem crescente, encontrar a k-esima
 * estatistica de ordem da uniao ordenada deles.
 * 
 * Restricoes: - os arrays nao possuem elementos em comum e nem repetidos - k eh
 * um numero compreendido entre 1 e array1.length + array2.length - caso o
 * k-esima estatistica de ordem nao exista, o metodo deve retornar null - voce
 * nao pode usar memoria extra - seu algoritmo deve ter complexidade
 * O(array1.length + array2.length). - voce nao pode usar nenhum metodo pronto
 * de manipulacao de arrays, exceto length.
 * 
 * @author adalbertocajueiro
 *
 */
// tenho dois arrays ordenados uso a ideia do merge.

public class OrderStatisticsSortedUnion<T extends Comparable<T>> {
	public T statisticsOrder(T[] array1, T[] array2, int k) {
		int counter = 0;
		int i = 0;
		int j = 0;
		T saida = null;

		while (i <= array1.length-1 && i <= array2.length-1 && counter < k) {
			if(array1[i].compareTo(array2[j])<0) {
				saida = array1[i];
				i++;
				counter++;
			}else {
				saida = array2[j];
				j++;
				counter++;
			}
		}
		if(array1.equals(counter) || array2.equals(counter)) {
			return null;
		}
		
		return saida;

	}

}
