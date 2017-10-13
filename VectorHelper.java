/**
 * Classe définissant quelques méthodes de manipulation de vecteurs.
 * @version 1.0
 */
public class VectorHelper 
{
  /**
   * Trie le vecteur donné en utilisant le trie par insertion.
   * @param vect Le vecteur à trier.
   * 
   * <pre>
   * <b>Example</b>
   * {@code 
   * int[] vect = {9, 8, 2, 3, 4, 1}
   * 
   * VectorHelper.trierVecteur(vect);
   * for(int n : vect)
   *    System.out.print(n + " ");
   * }
   * 
   * <b>Result:</b>
   * 1 2 3 4 8 9
   * </pre>
   */
  public static void trierVecteur(int[] vect)
  {
    int cle, j;
    
    for(int i = 1; i < vect.length; ++i)
    {
      cle = vect[i];
      
      j = i - 1;
      while(j >= 0 && vect[j] > cle)
      {
        vect[j + 1] = vect[j];
        --j;
      }
      
      vect[j + 1] = cle;
    }
  }
  
  /**
   * Calcule la somme de deux vecteurs. Les deux vecteurs doivent avoir la même taille.
   * @param vect1 Premier vecteur.
   * @param vect2 Deuxième vecteur.
   * @return Le vecteur dont le contenu de la case i est vect1[i] + vect2[i].
   * @exception IllegalArgumentException dans le cas où les vecteurs n'ont pas la même taille.
   * 
   * <pre>
   * <b>Example</b>
   * {@code 
   * int[] vect1 = {1, 2, 3},
   *       vect2 = {2, 3, 4};
   * 
   * int[] res = VectorHelper.sommerVecteurs(vect1, vect2);
   * 
   * for(int n : res)
   *    System.out.println(n + " ");
   * }
   * 
   * <b>Result</b>
   * 
   * 3 5 7
   * </pre>
   */
  public static int[] sommerVecteurs(int[] vect1, int[] vect2)
  {
    if(vect1.length != vect2.length)
      throw new IllegalArgumentException("La taille des deux vecteurs est différentes.");
    
    int[] retVect = new int[vect1.size()];
    
    for(int i = 0; i < vect1.length; ++i)
      retVect[i] = vect1[i] + vect2[i];
    
    return retVect;
  }
}
