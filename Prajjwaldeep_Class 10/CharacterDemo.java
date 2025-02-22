import java.lang.*;

public class CharacterDemo {

   public static void main(String[] args) {

      // create 2 char primitives ch1, ch2
      char ch1, ch2;

      // assign values to ch1, ch2
      ch1 = ' ';
      ch2 = 'a';

      // + create 2 boolean primitives b1, b2
      boolean b1, b2;

      /**
       *  check if ch1, ch2 are whitespace characters and 
       *  assign results to b1, b2
       */
      b1 = Character.isWhitespace(ch1);
      b2 = Character.isWhitespace(ch2);

      String str1 = "ch1 is a Java whitespace character is " + b1;
      String str2 = "ch2 is a Java whitespace character is " + b2;

      // print b1, b2 values
      System.out.println( str1 );
      System.out.println( str2 );
   }
}