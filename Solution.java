import java.util.Scanner;

public class Solution {

  public static String trans1(int num) {
    String result = "";
    while (num > 0) {
      if (num - 100 >= 0) {
        result += "C";
        num -= 100;
      } else if (num - 90 >= 0) {
        result += "XC";
        num -= 90;
      } else if (num - 50 >= 0) {
        result += "L";
        num -= 50;
      } else if (num - 40 >= 0) {
        result += "XL";
        num -= 40;
      } else if (num - 10 >= 0) {
        result += "X";
        num -= 10;
      } else if (num - 9 >= 0) {
        result += "IX";
        num -= 9;
      } else if (num - 5 >= 0) {
        result += "V";
        num -= 5;
      } else if (num - 4 >= 0) {
        result += "IV";
        num -= 4;
      } else if (num - 1 >= 0) {
        result += "I";
        num -= 1;
      }
    }
    return result;
  };

  public static int trans2(String num) {
    int result = 0;
    int i = num.length() - 1;
    while (i >= 0) {
      if (num.charAt(i) == 'I') {
        result += 1;
        i--;
      } else if (num.charAt(i) == 'V') {
        if (i - 1 >= 0 && num.charAt(i - 1) == 'I') {
          result += 4;
          i -= 2;
        } else {
          result += 5;
          i--;
        }
      } else if (num.charAt(i) == 'X') {
        if (i - 1 >= 0 && num.charAt(i - 1) == 'I') {
          result += 9;
          i -= 2;
        } else {
          result += 10;
          i--;
        }
      } else if (num.charAt(i) == 'L') {
        if (i - 1 >= 0 && num.charAt(i - 1) == 'X') {
          result += 40;
          i -= 2;
        } else {
          result += 50;
          i--;
        }
      } else if (num.charAt(i) == 'C') {
        if (i - 1 >= 0 && num.charAt(i - 1) == 'X') {
          result += 90;
          i -= 2;
        } else {
          result += 100;
          i--;
        }
      } else {
        System.out.println("invalid letter.");
        return result;
      }
    }
    return result;
  };

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input(Integer): ");
    int num = sc.nextInt();
    String ans = trans1(num);
    System.out.println("Result: " + ans);
    System.out.print("Input(String): ");
    String str = sc.next();
    int ans2 = trans2(str);
    System.out.println("Result: " + ans2);

    sc.close();
  }

}
