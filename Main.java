
public class Main {

    public static void main(String[] args) {

        //Example 1
        String string ="www.PhyeX.com";
        String newString = string.replaceAll("PhyeX","");
        System.out.println(newString);
       // Output: www..com

       // Regular expressions are extremely useful in extracting information from text such as: code, log files, spreadsheets, documents, etc.

       //Example 2
        String string = "P+H-Y*E.X=PhyeX";
        String newString = string.replaceAll("P.H.Y.E.X","PhyeX");
        System.out.println(newString);
      //  Output: PhyeX=PhyeX

      // Note: If you want to match (.) in the test string, you need to escape the dot by using a slash \.. In Java, use \\. instead of \..

      // Example 3

     //  Task:You have a test string S. Your task is to match the pattern xxXxxXxxxx
     //  Here x denotes a digit character, and X denotes a non-digit character.

     String string = "06-11-2015";
     String string2 = "123-153.a15";
     System.out.println(string.matches("\\d{2}\\D\\d{2}\\D\\d{4}"));
     System.out.println(string2.matches("\\d{2}\\D\\d{2}\\D\\d{4}"));

     // Output:True
     // Output:False

     //  The expression \d matches any digit [0-9].
     //  The expression \D matches any character that is not a digit.

     // Example 4

     // Task:You have a test String S.Your task is to match the pattern XXxXXxXX
     // Here,x denotes whitespace characters,and X denotes non-White space characters.

     String string = "12 11 15";
     String string2 = "12 132 13";
     System.out.println(string.matches("\\S{2}\\s\\S{2}\\s\\S{2}"));
     System.out.println(string2.matches("\\S{2}\\s\\S{2}\\s\\S{2}"));

     // Output: true
     // Output: false
     // The expression \s matches any whitespace character [ \r\n\t\f ].
     // The expression \S matches any non-white space character.

     //Example 5

     //Task:You have a test string S.Your task is to match pattern xxxXxxxxxxxxxxXxxx
     //Here x denotes any word character and X denotes any non-word character.

      String string = "192.168901351.102";
      String string2 = "www.hackeranka.com";
      System.out.println(string.matches("\\w{3}\\W\\w{10}\\W\\w{3}"));
      System.out.println(string2.matches("\\w{3}\\W\\w{10}\\W\\w{3}"));
      // Output: false
      // Output: True

     // The expression \w will match any word character.
     // Word characters include alphanumeric characters (a-z,A-Z and 0-9) and underscores(_).
     // The expression \W matches any non-word character.
     // Non-word characters include characters  other than alphanumeric characters like (>£#$½{]}).

     //Example 6

     //Task:You have a test string S.Your task is to match the pattern Xxxxx.
     //Here,x denotes a word charachter,and X denotes a digit.
     //S must start with a digit X and end with '.' symbol.
     //S should be 6 characters long only.

     String string = "0qwer.";
     String string2 ="8wait.";
     System.out.println(string.matches("^\\d\\w{4}\\.$"));
     System.out.println(string2.matches("^\\d\\w{4}\\.$"));

     // Output:
     // Output:

     // The ^ symbol matches the position at the start of a string.
     // The $ symbol matches the position at the end of a string.

     //Example 7

     //Task:You have a test string S.
     //Your task is to write a regex that will match S with following conditions.
     // * S must be length:6.
     // * First Character:1,2 or 3
     // * Second Character: 1,2,0
     // * Third character: x, s or 0
     // * Fourth character: 3, 0 , A or a
     // * Fifth character: x, s or u
     // * Sixth character: . or ,

     String string = "1203x.";
     String string2 = "32xAx,";

     System.out.println(string.matches("^[123][120][xs0][30Aa][xsu][.,]$"));
     System.out.println(string2.matches("^[123][120][xs0][30Aa][xsu][.,]$"));
     // Output:true
     // Output:true

     // The character class [] matches only one out of several characters placed inside the square brackets.

     //Example 8

     //Task: You have a test String S.
     //Your task is to write a regex that will match S with the following conditions:
    // * First character should not be a digit (1-9).
    // * Second character should not be a lowercase vowel (aeiou).
    // * Third character should not be b, c, D or F.
    // * Fourth character should not be a whitespace character ( \r, \n, \t, \f or <space> ).
    // * Fifth character should not be a uppercase vowel (AEIOU).
    // * Sixth character should not be a . or , symbol.
     String string = "think?";
     String string2 = "9adab=";

     System.out.println(string.matches("^[^\\d][^aeiou][^bcDF][^\\W][^AEIOU][^.,]$"));
     System.out.println(string2.matches("^[^\\d][^aeiou][^bcDF][^\\W][^AEIOU][^.,]$"));

     // Output:true
     // Output:false

    // The negated character class [^] matches any character that is not in the square brackets.

    //Example 9

    // Task: Write a RegEx that will match a string satisfying the following conditions:
    // The string's length is >= 5.
    //The first character must be a lowercase English alphabetic character.
    //The second character must be a positive digit. Note that we consider zero to be neither positive nor negative.
    //The third character must not be a lowercase English alphabetic character.
    //The fourth character must not be an uppercase English alphabetic character.
    //The fifth character must be an uppercase English alphabetic character.

    String string = "h4CkR";
    String string2 = "t4YyP";
    System.out.println(string.matches("^[a-z][1-9][^a-z][^A-Z][A-Z].*"));
    System.out.println(string2.matches("^[a-z][1-9][^a-z][^A-Z][A-Z].*"));

    // Output: true
    // Output: true

    //  .* after then this expression anything can come but at least It need to be min.(* since the statement said the string length can be at least 5 characters long but it could be more.)
    //A hyphen (-) inside a character class specifies a range of characters where the left and right operand are the respective lower and uppder bounds of the range.
    // Example:
      // [a-z] is the same as [abcdefghıiklmnopr..]
      // [A-Z] is the same as [ABCDEFGHIKLMNOPRS..]
      // [0-9] is the same as [0123456789]

     // Example 10

     // Task:You have a test string S.
     // Your task is to write a regex that will match S using the following conditions:
     // S must be length equal to 45.
     // The first 40 characters should consist of letters(both lowercase and uppercase),or of even digits.
     // The last 5 characters should consist of odd digits or whitespace characters.

     String string = "2222222222aaaaaaaaaa2222222222aaaaaaaaaa13 57";
     String string2 = "3333333333aaaaaaaaaa2222222222bbbbbbbbbb19 45";
     System.out.println(string.matches("^[a-zA-z246810]{40}[13579\\W]{5}$"));
     System.out.println(string2.matches("^[a-zA-z246810]{40}[13579\\W]{5}$"));
     // Output: true
     // Output: false

     //{x}
     //The tool {x} will match exactly x repetitions of character/character class/groups.



    }
}