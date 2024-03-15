
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList listTugas = new DoublyLinkedList();
        Scanner userInput = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("1. Input tugas");
            System.out.println("2. Delete tugas");
            System.out.println("3. Lihat list tugas");
            System.out.println("4. Keluar");

            System.out.print("Pilih Operasi: ");
            pilihan = userInput.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Input Data Tugas");
                    System.out.print("Mata Kuliah: ");
                    String mataKuliah = userInput.next(); userInput.nextLine();
                    System.out.print("Tugas: ");
                    String tugas = userInput.next(); userInput.nextLine();
                    System.out.print("Deadline: ");
                    String deadlineTugas = userInput.next(); userInput.nextLine();

                    listTugas.inputTugas(new Data(mataKuliah, tugas, deadlineTugas));
                    break;
                case 2:
                    System.out.println("1. Hapus tugas di awal list");
                    System.out.println("2. Hapus tugas di akhir list");
                    System.out.println("3. Hapus tugas berdasarkan mata kuliah");
                    System.out.println("4. Hapus tugas berdasarkan nama tugas");

                    System.out.print("Masukkan pilihan: ");
                    int pilihanHapus = userInput.nextInt();

                    switch (pilihanHapus) {
                        case 1:
                            listTugas.hapusTugasPertama();
                            System.out.println("Tugas berhasil dihapus");
                            break;
                        case 2:
                            listTugas.hapusTugasTerakhir();
                            System.out.println("Tugas berhasil dihapus");
                            break;
                        case 3:
                            System.out.println("Masukkan mata kuliah yang ingin dihapus: ");
                            String mataKuliahDihapus = userInput.next(); userInput.nextLine();
                            listTugas.hapusTugasMatkul(mataKuliahDihapus);
                            System.out.println("Tugas berhasil dihapus");
                            break;
                        case 4:
                            System.out.println("Masukkan nama tugas yang ingin dihapus: ");
                            String tugasDihapus = userInput.next(); userInput.nextLine();
                            listTugas.hapusTugasNama(tugasDihapus);
                            System.out.println("Tugas berhasil dihapus");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Cetak list dari awal");
                    System.out.println("2. Cetak list dari akhir");

                    System.out.print("Pilihan menu: ");
                    int pilihanCetak = userInput.nextInt();

                    if (pilihanCetak == 1) {
                        listTugas.cetakDariAwal();
                    } else if (pilihanCetak == 2) {
                        listTugas.cetakDariAkhir();
                    }
                    break;
            }
        } while (pilihan != 4);
    }
}
