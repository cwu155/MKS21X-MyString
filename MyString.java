import java.util.*;

public class MyString implements CharSequence,Comparable<CharSequence>{
  //Need to throw exceptions
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);
    }
  }

  //Methods

  public int length(){
    int count = 0;
    for (int i = 0; i < data.length; i++){
      count += 1;
    }
    return count;
  }

  public char charAt(int index){
    try {
    return data[index];
  } catch (ArrayIndexOutOfBoundsException e) {
    return 'N';
  }
}

  public CharSequence subSequence(int a, int b){
    String result = "";
    try {
    for (int i = a; i < b; i++){
        result += data[i];
      }
        return result;
    } catch (IndexOutOfBoundsException e){
    return "Boohoo";
    }
  }



  public String toString(){
    String result = "";
    for (int i = 0; i < data.length; i++){
        result += data[i];
    }
    return result;
  }

  public int compareTo(CharSequence s){
    String original = data.toString();
    int difference = 0;
    try {
    for (int i = 0; i < s.length(); i++){
      if ((int) original.charAt(i) > (int) s.charAt(i)){
        difference += 1;
      } else if ((int) original.charAt(i) > (int) s.charAt(i)){
        difference -= 1;
      } else {
        return 0;
        }
      }
    return difference;
  } catch (StringIndexOutOfBoundsException e){
  return (original.length() - s.length());
  }
}
}
