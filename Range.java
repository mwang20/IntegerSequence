import java.util.NoSuchElementException;
import java.util.ArrayList;
public class Range implements IntegerSequence{
  private int start,end,current;
  ArrayList<Integer> rList = new ArrayList<Integer>();
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
  public int next() throws NoSuchElementException{
    if (rList.get(current - start + 1) == null){
      throw new NoSuchElementException("No next value; out of bounds");
    }
    else return rList.get(current - start + 1);
  }
  public boolean hasNext(){
    if (rList.get(current - start + 1) != null){
      return true;
    }
    else return false;
  }
}
