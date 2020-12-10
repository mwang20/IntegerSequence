import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  public int start,end,current;
  private int currentIndex;
  private int []data;
  public ArraySequence(int [] other){
    data = new int[other.length];
    for (int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
    start = 0;
    end = data.length - 1;
    current = 0;
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

    int rtn = data[current];
    current += 1;
    return rtn;
  }
}
