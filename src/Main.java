/*
1.1.9
String s = "";
for (int n = N; n > 0; n /= 2)
s = (n % 2) + s;
*/

public class Main
{
    public static void main(String[] args)
    {
        int N = 10;
        String s = "";

        for(int n = N; n > 0; n /= 2)
        {
            s = (n % 2) + s;
        }//end for lop
    System.out.println("Binary number: " + s);

        Binary.toBinary();

    }//end main
}//end class

//using toStringBinary
class Binary
{
    public static void toBinary()
    {
        int n = 10;
        String binary = Integer.toBinaryString(n);
        System.out.println("Binary Number: " + binary);

    }//end toBinary
}//end Binary