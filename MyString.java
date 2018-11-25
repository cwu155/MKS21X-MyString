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
    for (int i = a; i < b; i++){
        result += data[i];
      }
    return result;
  }

  public String toString(){
    String result = "";
    for (int i = 0; i < data.length; i++){
        result += data[i];
    }
    return result;
  }

  public int compareTo(CharSequence s){
    if (this.length() > s.length()){
      return 1;
    }
    if (this.length() < s.length()){
      return -1;
    }
    if (this.length() == s.length()){
      return 0;
    }
    return this.compareTo(s);
  }


}
