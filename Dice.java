import java.util.Random;
class Dice{
    public static void main(String[] args){
	int d1=0,d2=0;
	System.out.println("Rolling dice...");
	Random r = new Random();
	d1=r.nextInt(6)+1;
	d2=r.nextInt(6)+1;
	System.out.println("Die 1: "+d1);
	System.out.println("Die 2: "+d2);
	System.out.println("Total value: "+(d1+d2));
    }
}
