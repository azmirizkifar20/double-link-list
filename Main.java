import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Function fungsi = new Function();
        Scanner input = new Scanner(System.in);
        boolean jalan = true;

        while (jalan) {
            System.out.println("==============================");
            System.out.println("Program Double Link List");
            System.out.println("1. Insert depan");
            System.out.println("2. Insert belakang");
            System.out.println("3. Insert tengah");
            System.out.println("4. Hapus depan");
            System.out.println("5. Hapus belakang");
            System.out.println("6. Hapus tengah");
            System.out.println("7. Tampil dari depan");
            System.out.println("8. Tampil dari belakang");
            System.out.println("9. Tampilkan Juara");
            System.out.println("10. Exit");
            System.out.println("==============================");
            System.out.print("Silahkan pilih menu => ");
            int pilih = input.nextInt();
            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama   : "); String nama = input.next();
                    System.out.print("Masukkan NIM    : "); int nim = input.nextInt();
                    System.out.print("Masukkan Nilai  : "); int nilai = input.nextInt();
                    Mahasiswa data = new Mahasiswa(nama, nim, nilai);
                    fungsi.insertDepan(data);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Masukkan Nama   : "); String nama2 = input.next();
                    System.out.print("Masukkan NIM    : "); int nim2 = input.nextInt();
                    System.out.print("Masukkan Nilai  : "); int nilai2 = input.nextInt();
                    Mahasiswa data2 = new Mahasiswa(nama2, nim2, nilai2);
                    fungsi.insertBelakang(data2);
                    System.out.println();
                    break;

                case 3:
                    if (fungsi.isEpmty()) {
                        System.out.println("Isi data depan terlebih dahulu!");
                        System.out.println();
                    } else {
                        System.out.print("Insert setelah nim : ");
                        int key = input.nextInt();
                        System.out.print("Masukkan Nama   : ");
                        String nama3 = input.next();
                        System.out.print("Masukkan NIM    : ");
                        int nim3 = input.nextInt();
                        System.out.print("Masukkan Nilai  : "); int nilai3 = input.nextInt();
                        Mahasiswa data3 = new Mahasiswa(nama3, nim3, nilai3);
                        fungsi.insertTengah(data3, key);
                        System.out.println();
                    }
                    break;

                case 4:
                    fungsi.hapusDepan();
                    System.out.println();
                    break;

                case 5:
                    fungsi.hapusBelakang();
                    System.out.println();
                    break;

                case 6:
                    if (fungsi.isEpmty()) {
                        System.out.println("Maaf, data kosong!");
                        System.out.println();
                    } else {
                        System.out.print("Masukkan NIM yang ingin dihapus => ");
                        int key2 = input.nextInt();
                        fungsi.hapusTengah(key2);
                    }
                    break;

                case 7:
                    fungsi.tampilDepan();
                    break;

                case 8:
                    fungsi.tampilBelakang();
                    break;

                case 9:
                    fungsi.tampilJuara();
                    break;

                case 10:
                    System.out.println("Terimakasih :)");
                    jalan = false;
                    break;

                default:
                    System.out.println("maaf pilihan salah!");
                    break;
            }
        }
    }
}
