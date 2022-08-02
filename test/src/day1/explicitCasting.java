public class explicitCasting {
    public static void main(String args[])
	{
        //When you are assigning a larger type to a smaller type, then Explicit Casting is required
		double d = 75.0;
		// Explicit casting is needed for below conversion
		float f = (float) d;
		long l = (long) f;
		int i  = (int) l;
		short s = (short) i;
		byte b = (byte) s;
		
		System.out.println("double value : "+d);
		System.out.println("float value : "+f);
		System.out.println("long value : "+l);
		System.out.println("int value : "+i);
		System.out.println("short value : "+s);
		System.out.println("byte value : "+b);
	}
}



/*
Output :

double value : 75.0
float value : 75.0
long value : 75
int value : 75
short value : 75
byte value : 75
*/