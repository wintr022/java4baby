import java.util.Random;
import java.util.Scanner;

class d6{
  public static void main(String args[]){
    Random d6 = new Random();
    Scanner sc = new Scanner(System.in);
    int total = 0;

    print("How many rolls?");
    int rolls = Integer.valueOf(sc.nextLine());

    print(" --- ");
    for (int i = 0; i < rolls; i++){
      int value = roll(d6);
      print("| " + String.valueOf(value) + " |");
      print(" --- ");
      total = total + value;
    }
    print("TOTAL");
    print("______");
    print("| " + String.valueOf(total) + " |");
  }
  public static void print(String a){
    System.out.println(a);
  }
  public static int roll(Random die){
    return die.nextInt(6) + 1;
  }
}
