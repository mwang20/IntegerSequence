import java.util.NoSuchElementException;
import java.util.ArrayList;
public class Range implements IntegerSequence{
  private int start,end,current;
  ArrayList<Integer> rList = new ArrayList();
  public Range(int start,  int end){
    for (int i = 0; i < (end - start); i++){
      current = i + start;
      rList.add(i + end);
    }
  }
  public void reset(){
    current = start;
  }
  public int length(){
    return rList.size();
  }
}
