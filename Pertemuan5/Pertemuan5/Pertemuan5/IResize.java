/* Nama File    : IResize.java
 * Deskripsi    : Membuat interface IResize untuk mengubah ukuran bangun datar
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Rabu, 25 Juni 2026
 */

public interface IResize {
    //menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}