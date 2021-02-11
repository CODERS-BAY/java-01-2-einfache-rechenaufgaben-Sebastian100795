public class Main {
    public static void main(String[] args) {

        int zahl1 = 10;
        int zahl2 = 5;

        int ergebnis = zahl1 + zahl2;
        System.out.println(zahl1 + " + " +zahl2 + " = " + ergebnis);
        ergebnis= zahl1-zahl2;
        System.out.println(zahl1 + "-" + zahl2 + "=" + ergebnis);
        ergebnis= zahl1*zahl2;
        System.out.println(zahl1 + "*" +  zahl2 + " = " + ergebnis);
        ergebnis=zahl1/zahl2;
        System.out.println(zahl1 + "/" + zahl2 + "=" + ergebnis);

        double zahl3 = 25.7;
        double zahl4 = 12.5;


        System.out.printf("%.3f + %.3f = %.3f \n", zahl3, zahl4, zahl3+zahl4);

        System.out.printf("%.3f - %.3f = %.3f \n",zahl3, zahl4, zahl3-zahl4);

        System.out.printf("%.3f * %.3f = %.3f \n", zahl3,zahl4,zahl3*zahl4);

        System.out.printf("%.3f / %.3f = %.3f \n",zahl3, zahl4, zahl3/zahl4);

    }

}