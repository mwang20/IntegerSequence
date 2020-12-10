import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;
  public ArraySequence(int [] other){
    data = new int[other.length];
    for (int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
  }
  public void reset(){
    currentIndex = 0;
  }
  public int length(){
    return data.length - 1;
  }
  public boolean hasNext(){
    if (currentIndex > length()){
      return false;
    }
    return true;
  }
  public int next(){
    if (hasNext() == false){
      throw new NoSuchElementException();
    }

    int rtn = currentIndex;
    currentIndex += 1;
    return rtn;
  }
}
