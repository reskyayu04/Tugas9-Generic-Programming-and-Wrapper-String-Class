package tgs9;

/*
Nama      : Resky Ayu Dewi Talasari_13020180128
Kelas     : B2
hari/tgl  : Minggu, 10 Mei 2020
 */

public class GenericType {
    public static void main(String[] args) {
        Integer nilai = 90;
        Double IPK = 3.82;
        Character Grade = 'A';
        String Matkul = "PBO";
 
      System.out.println();
      System.out.println("cetak nilai :");
 
      print("Nilai = "+nilai);
      print("IPK = "+IPK);
      print("Grade = "+Grade);
      print("Mata Kuliah = "+Matkul);        
   }
 
   public static <T> void print(T nilai) {
      System.out.println(nilai);      
        }
}

