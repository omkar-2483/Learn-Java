// java supports octal and hexadecimal and binary integers
// octal numbers have prefix 0
// hexadecimal have prefox 0X
//binary have prefix 0b

class OctalHexadecimal{
    public static void main(String[] args){
        int num=010-02;
        System.out.println(num);
        int num2=0X10-0X1;
        System.out.println(num2);
        int num3=0b1010;
        System.out.println(num3);
        int num4=123_456_789;
        System.out.println(num4);
        float num5=2E2f;
        System.out.println(num5);
    }
}