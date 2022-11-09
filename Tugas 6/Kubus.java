public class Kubus extends BangunRuang {
  private float sisi;

  public Kubus(float sisi) {
    this.sisi = sisi;
  }

  @Override
  float hitungLuas() {
    return 6 * this.sisi * this.sisi;
  }
}
