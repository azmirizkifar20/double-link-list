public class Mahasiswa {
    String nama;
    int nim;
    int nilai;

    public Mahasiswa(String nama, int nim, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public void tampil() {
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Nilai  : " + nilai);
        System.out.println();
    }
}
