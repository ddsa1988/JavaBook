public class Main {

    public static void main (String [] args){

        byte aByte = 127; //8 bits [-128 to 127]
        short aShort = 32767; //16 bits [-32768 to 32767]
        int aInt = 2147483647; //32 bits [-2147483648 to 2147483647]
        long aLong = 2147483647214748236L; //64 bits [-2^63 to 2^63 - 1]

        float aFloat = 36985.56f; //32 bits
        double aDouble = 145215852547.63d; //64 bits

        boolean aBoolean = true; // [true or false]
        char aChar = 'D'; //16 bits [0 to 65535]

        System.out.println("Byte's size: " + Byte.SIZE);
        System.out.println("Short's size: " + Short.SIZE);
        System.out.println("Integer's size: " + Integer.SIZE);
        System.out.println("Long's size: " + Long.SIZE);
        System.out.println("Float's size: " + Float.SIZE);
        System.out.println("Double's size: " + Double.SIZE);
        System.out.println("Char's size: " + Character.SIZE);

    }
}
