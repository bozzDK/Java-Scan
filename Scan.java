import java.util.*; //S�dan imprter du alt

public class Scan
{
public static void main(String[] args)
{
  Scanner in = new Scanner (System.in); // Starter altid med at skrive for at f� input i consolen.
  
  
  System.out.println("Hvad hedder du?");
  
  String navn = in.next(); // S�dan skriver man en String input
  
  System.out.println ("jeg hedder " + navn);
  
  System.out.println("Hvor gammel er du?"); 
 
  int alder = in.nextInt(); //S�dan skriver man int input
  
  System.out.println("Jeg er " + alder + " �r gammel");
  
  System.out.println("Hvor er din karakter gennemsnit");
  
  double kara = in.nextDouble();// S�dan skriver man double input.
  
  System.out.println("Min karater er " + kara);
  

}
}