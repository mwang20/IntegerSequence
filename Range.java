import java.util.NoSuchElementException;
import java.util.ArrayList;
public class Range implements IntegerSequence{
  private int start,end,current;
  ArrayList<Integer> rList = new ArrayList<Integer>();
  public Range(int start,  int end){
    this.start = start;
    this.end = end;
    this.current = start;
  }
  public void reset(){
    current = start;
  }
  public int length(){
    return end - start;
  }
  public int next() throws NoSuchElementException{
    if (current + 1 > end){
      current += 1;
      throw new NoSuchElementException("No next value; out of bounds");
    }
    else {
      current += 1;
      return current;
    }
  }
  public boolean hasNext(){
    if (next() <= end){
      return true;
    }
    else return false;
  }
}
