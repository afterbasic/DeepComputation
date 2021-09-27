import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner Operator_Input_User = new Scanner(System.in);
    int Operator_Indeks_Nilai_Awal;
    int Operator_Indeks_Nilai_Akhir;
    int Operator_Indeks_Nilai_Total;
    Operator_Indeks_Nilai_Total = 0;
    System.out.print("Masukan nilai awal: ");
    Operator_Indeks_Nilai_Awal = Operator_Input_User.nextInt();
    System.out.print("Masukan nilai akhir: ");
    Operator_Indeks_Nilai_Akhir = Operator_Input_User.nextInt();
    while(Operator_Indeks_Nilai_Awal <= Operator_Indeks_Nilai_Akhir) {
      Operator_Indeks_Nilai_Total = Operator_Indeks_Nilai_Total + Operator_Indeks_Nilai_Awal;
      System.out.print("Hasil = " + Operator_Indeks_Nilai_Total + "\n");
      Operator_Indeks_Nilai_Awal = (Operator_Indeks_Nilai_Awal + 1);
    }
  }
}