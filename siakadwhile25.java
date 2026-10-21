import java.util.Scanner;
public class siakadwhile25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml,nilai,i=0;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jml = sc.nextInt();
        while (i<jml){
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) + " :");
            nilai = sc.nextInt();
            if (nilai<0 || nilai>100){
                System.out.println("Nilai tidak valid, masukkan nilai yang benar (0-100)");
                continue;
            }
            if (nilai>80 && nilai<=100){
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " : " + nilai + " (A)");
                System.out.println("Bagus, pertahankan nilai mu!");
            }else if (nilai>73 && nilai<=80){
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " : " + nilai + " (B+)");
            }else if (nilai>65 && nilai<=73){
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " : " + nilai + " (B)");
            }else if (nilai>60 && nilai<=65){
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " : " + nilai + " (C+)");
            }else if (nilai>50 && nilai<=60){
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " : " + nilai + " (C)");
            }else if (nilai>39 && nilai<=50){
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " : " + nilai + " (D)");
            }else if (nilai>=0 && nilai<=39){
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " : " + nilai + " (E)");
            }
            i++;
        }
    }
}
