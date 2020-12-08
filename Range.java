import java.util.NoSuchElementException;
import java.util.ArrayList;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
    ArrayList<Integer> rList = new ArrayList();
    for (int i = 0; i < (end - start); i++){
      current = i + start;
      rList.add(i + end);
    }
  }
}
