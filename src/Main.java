import com.sun.org.apache.xpath.internal.objects.XString;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        String namaDepan = "Muhammad";
        String namaTengah = "Ihsan";
        String namaBelakang = "Ramadhan";
        int usia = 20;
        int targetKuliah = 4;
        double ipk = 3.89764512;
        char nilaiAbjad = 'A';
        boolean statusAktif = true;

        System.out.println(namaDepan + namaTengah + namaBelakang);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);

        System.out.println(uniskaString);

        String namaLengkap = namaDepan + " " + namaTengah + " " + namaBelakang;
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("san"));
        System.out.println(namaLengkap.substring(5));
        System.out.println(namaLengkap.substring(5, 12));
        System.out.println(namaLengkap.replace("Ih", "Ha"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split(" ");

        for (String nama : namaArray) {
            System.out.println(nama);
        }

    }

}
