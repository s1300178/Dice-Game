import java.util.Random;
import java.util.Scanner;
class Dice{
    public static void main(String[] args){
	int d1=0,d2=0;
	String name;
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	System.out.print("> ");
	name = sc.next();
	System.out.println("Hallo, "+name+"!");
	System.out.println("Rolling dice...");
	Random r = new Random();
	d1=r.nextInt(6)+1;
	d2=r.nextInt(6)+1;
	System.out.println("Die 1: "+d1);
	System.out.println("Die 2: "+d2);
	System.out.println("Total value: "+(d1+d2));
	if((d1+d2)>7){
	    System.out.println("You won");
	}
	else{
	    System.out.println("You lost");
	}
    }
}
