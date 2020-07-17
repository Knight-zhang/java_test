package thread;
public class Chapter8_4 {
    public static void main (String args[ ]) {
      String str = "ab123youÄãÊÇË­£¿";
      String regex = "\\D+";
      str = str.replaceAll(regex,"");
      System.out.println(str);
    }
}
