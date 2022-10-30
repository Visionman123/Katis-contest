package Frankfurt.Katis.Week1;

import java.util.*; //scanner + hashmap

public class False_Sense_of_Security {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // . = 1; - = 2
    HashMap<Character, String> letter_to_code = new HashMap<>();
    letter_to_code.put('A', "12");
    letter_to_code.put('B', "2111");
    letter_to_code.put('C', "2121");
    letter_to_code.put('D', "211");
    letter_to_code.put('E', "1");
    letter_to_code.put('F', "1121");
    letter_to_code.put('G', "221");
    letter_to_code.put('H', "1111");
    letter_to_code.put('I', "11");
    letter_to_code.put('J', "1222");
    letter_to_code.put('K', "212");
    letter_to_code.put('L', "1211");
    letter_to_code.put('M', "22");
    letter_to_code.put('N', "21");
    letter_to_code.put('O', "222");
    letter_to_code.put('P', "1221");
    letter_to_code.put('Q', "2212");
    letter_to_code.put('R', "121");
    letter_to_code.put('S', "111");
    letter_to_code.put('T', "2");
    letter_to_code.put('U', "112");
    letter_to_code.put('V', "1112");
    letter_to_code.put('W', "122");
    letter_to_code.put('X', "2112");
    letter_to_code.put('Y', "2122");
    letter_to_code.put('Z', "2211");
    letter_to_code.put('_', "1122");
    letter_to_code.put('.', "2221");
    letter_to_code.put(',', "1212");
    letter_to_code.put('?', "2222");

    HashMap<String, Character> code_to_letter = new HashMap<>();
    code_to_letter.put("12", 'A');
    code_to_letter.put("2111", 'B');
    code_to_letter.put("2121", 'C');
    code_to_letter.put("211", 'D');
    code_to_letter.put("1", 'E');
    code_to_letter.put("1121", 'F');
    code_to_letter.put("221", 'G');
    code_to_letter.put("1111", 'H');
    code_to_letter.put("11", 'I');
    code_to_letter.put("1222", 'J');
    code_to_letter.put("212", 'K');
    code_to_letter.put("1211", 'L');
    code_to_letter.put("22", 'M');
    code_to_letter.put("21", 'N');
    code_to_letter.put("222", 'O');
    code_to_letter.put("1221", 'P');
    code_to_letter.put("2212", 'Q');
    code_to_letter.put("121", 'R');
    code_to_letter.put("111", 'S');
    code_to_letter.put("2", 'T');
    code_to_letter.put("112", 'U');
    code_to_letter.put("1112", 'V');
    code_to_letter.put("122", 'W');
    code_to_letter.put("2112", 'X');
    code_to_letter.put("2122", 'Y');
    code_to_letter.put("2211", 'Z');
    code_to_letter.put("1122", '_');
    code_to_letter.put("2221", '.');
    code_to_letter.put("1212", ',');
    code_to_letter.put("2222", '?');

    String message;
    while (sc.hasNextLine()) {
      message = sc.nextLine();
      StringBuilder code = new StringBuilder();
      StringBuilder number = new StringBuilder();
      StringBuilder result = new StringBuilder();

      for (int i = 0; i < message.length(); i++) {
        code.append(letter_to_code.get(message.charAt(i))); // .-.-.--.---..-.-
        number.append(letter_to_code.get(message.charAt(i)).length()); //4342312443
      }

      //Reverse
      String numbers = number.reverse().toString();
      int numcount = 0;
      for (int i = 0; i < message.length(); i++) {
        result.append(code_to_letter.get(code.substring(numcount, numcount + Character.digit(numbers.charAt(i), 10))));
        numcount += Character.digit(numbers.charAt(i), 10);
      }
      System.out.println(result);
    }
    sc.close();
  }
}


