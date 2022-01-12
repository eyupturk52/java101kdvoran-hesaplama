import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float kdvsiztutar,kdvlitutar,kdv;
        System.out.print("tuatrı giriniz:");
        kdvsiztutar=input.nextFloat();
        boolean kdvoranı=kdvsiztutar<=1000;
        kdvlitutar= (kdvoranı) ? (kdvsiztutar+((kdvsiztutar*18)/100)):(kdvsiztutar+((kdvsiztutar*8)/100));
        kdv=kdvlitutar-kdvsiztutar;
        System.out.println("kdvsizutar=" +kdvsiztutar);
        System.out.println("kdvlitutar=" +kdvlitutar);
        System.out.println("kdv=" +kdv);

    }
}
