import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("====== Menghitung Luas Segitiga =======");
    System.out.println("Inputkan nilai kubus:");
    float Kubus = myScanner.nextFloat();

    BangunRuang inputKubus = new Kubus(Kubus);
    System.out.println("Luas dari Kubus Dengan sisi" + Kubus + "yaitu: " + inputKubus.hitungLuas());

    System.out.println("====== Menghitung Luas Balok =======");
    System.out.println("Inputkan panjang balok:");

    float inputPanjang = myScanner.nextFloat();
    System.out.println("Inputkan tinggi balok:");
    float inputTinggi = myScanner.nextFloat();
    System.out.println("Inputkan tinggi balok:");
    float inputLebar = myScanner.nextFloat();

    BangunRuang hitung = new Balok(inputPanjang, inputLebar, inputTinggi);
    System.out.println("Luas Balok adalah: " + hitung.hitungLuas());

    myScanner.close();
  }
}
