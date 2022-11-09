public class Balok extends BangunRuang {
  private float panjang;
  private float lebar;
  private float tinggi;

  public Balok(float panjang, float lebar, float tinggi) {
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
  }

  @Override
  float hitungLuas() {
    return 2 * (this.panjang * this.lebar + this.panjang * this.tinggi + this.lebar * this.tinggi);
  }
}
