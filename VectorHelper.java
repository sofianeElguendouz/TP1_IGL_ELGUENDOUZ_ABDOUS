import java.util.ArrayList;

public class VectorHelper 
{
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
