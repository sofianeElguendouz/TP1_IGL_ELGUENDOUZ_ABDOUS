/**
 * Classe définissant quelques méthodes de manipulation de vecteurs.
 * @version 1.0
 */
public class VectorHelper 
{
  /**
   * Calcule la somme de deux vecteurs. Les deux vecteurs doivent avoir la même taille.
   * @param vect1 Premier vecteur.
   * @param vect2 Deuxième vecteur.
   * @return Le vecteur dont le contenu de la case i est vect1[i] + vect2[i].
   * @exception IllegalArgumentException dans le cas où les vecteurs n'ont pas la même taille.
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
