import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
    if (end < start){
      throw new NoSuchElementException();
    }
    else {
      this.start = start;
      this.end = end;
      this.current = start;
    }
  }
  public void reset(){
    current = start;
  }
  public int length(){
    return (end - start) + 1;
  }
  public int next(){
    if (current + 1 > end){
      current += 1;
      throw new NoSuchElementException();
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
