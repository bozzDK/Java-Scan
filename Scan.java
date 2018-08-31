import java.util.*; //Sådan imprter du alt

public class Scan
{
public static void main(String[] args)
{
  Scanner in = new Scanner (System.in); // Starter altid med at skrive for at få input i consolen.
  
  
  System.out.println("Hvad hedder du?");
  
  String navn = in.next(); // Sådan skriver man en String input
  
  System.out.println ("jeg hedder " + navn);
  
  System.out.println("Hvor gammel er du?"); 
 
  int alder = in.nextInt(); //Sådan skriver man int input
  
  System.out.println("Jeg er " + alder + " år gammel");
  
  System.out.println("Hvor er din karakter gennemsnit");
  
  double kara = in.nextDouble();// Sådan skriver man double input.
  
  System.out.println("Min karater er " + kara);
  

}
}