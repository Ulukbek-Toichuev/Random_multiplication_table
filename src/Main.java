public class Main{
    public static void main(String[] args) {
        int i = (int) (1 + Math.random()*10);

        System.out.println(i + "=" + Integer.toBinaryString(i));
        String txt;
        for (int k=1; k<=20; k++){
            txt="-";
            System.out.print(txt);
        }

        for (int a = 1; a < 11; a++) {
            int b = i*a ;
            System.out.println("\n Целое число:"+ i * a +" = Двоичное число:" + Integer.toBinaryString(b));
        }
    }
}