import java.util.Scanner;

class functions{
  public static void main(String args[]){
    Scanner sc1 = new Scanner(System.in);

    print("Input # 1");
    int input1 = Integer.parseInt(sc1.nextLine());

    print("Input # 2");
    int input2 = Integer.parseInt(sc1.nextLine());

    print("Result");
    print("______________");
    print(add(input1, input2));
    //print("blue");
  }

  // Takes string and prints to console
  public static void print(String a){
    System.out.println(a);
  }

  // returns an int for first + second
  public static String add(int first, int second){
    return Integer.toString(first + second);
  }
}
