import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("enter a number: ");
      int Home = scan.nextInt();
      for(int w=0; w<Home; w++){
        for(int k=0; k<(Home-1)-w; k++){
          System.out.print(" ");
        }
        for(int k=0; k<1; k++){
          System.out.print("*");
        }
        for(int k=0; k>1+w; k++){
          System.out.print("*");
        }
        System.out.println();
      }

      for(int w=0; w<(Home-1); w++){
        for(int k=0; k<1+w; k++){
          System.out.print(" ");
        }
        for(int k=0; k<(Home-2)-w; k++){
          System.out.print("*");
        }
        for(int k=0; k<(Home-1)-w; k++){
          System.out.print("*");
        }
        System.out.println("");
      }
    }
  }
}
