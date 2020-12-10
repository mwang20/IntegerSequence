import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;
  public ArraySequence(int [] other){
    data = new int[other.length];
    for (int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
    currentIndex = 0;
  }
  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    for (int i = 0; i < otherseq.length(); i++){
      data[i] = otherseq.next();
    }
    otherseq.reset();
    currentIndex = 0;
  }
  public void reset(){
    currentIndex = 0;
  }
  public int length(){
    return data.length;
  }
  public boolean hasNext(){
    if (currentIndex > length() - 1){
      return false;
    }
    return true;
  }
  public int next(){
    if (hasNext() == false){
      throw new NoSuchElementException();
    }
    int rtn = data[currentIndex];
    currentIndex += 1;
    return rtn;
  }
}
