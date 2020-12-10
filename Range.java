import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  public int start,end,current;
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
  public boolean hasNext(){
    if (current > end){
      return false;
    }
    return true;
  }
  public int next(){
    if (hasNext() == false){
      throw new NoSuchElementException();
    }

    int rtn = current;
    current += 1;
    return rtn;
  }
}
