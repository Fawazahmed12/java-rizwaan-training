public class implicitCasting {
    public static void main(String args[])
	{
	    byte i = 50;
	    // No casting needed for below conversion
	    short j = i;
	    int k = j;
	    long l = k;
	    float m = l;
	    double n = m;
	    
	    System.out.println("byte value : "+i);
	    System.out.println("short value : "+j);
	    System.out.println("int value : "+k);
	    System.out.println("long value : "+l);
	    System.out.println("float value : "+m);
	    System.out.println("double value : "+n);
	}
}

/*
Output :

byte value : 50
short value : 50
int value : 50
long value : 50
float value : 50.0
double value : 50.0
*/