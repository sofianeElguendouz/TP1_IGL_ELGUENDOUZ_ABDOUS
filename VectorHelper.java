import java.util.ArrayList;

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
  public static ArrayList<Integer> sommerVecteurs(ArrayList<Integer> vect1, ArrayList<Integer> vect2)
  {
    if(vect1.size() != vect2.size())
      throw new IllegalArgumentException("La taille des deux vecteurs est différentes.");
    
    ArrayList<Integer> retVect = new ArrayList<>(vect1.size());
    
    for(int i = 0; i < vect1.size(); ++i)
      retVect.add(vect1.get(i) + vect2.get(i));
    
    return retVect;
  }
}
