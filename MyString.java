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
    return data[index];
  }

  public CharSequence subSequence(int a, int b){
  }

  public String toString(){

  }

  public int compareTo(CharSequence s){

  }




}
