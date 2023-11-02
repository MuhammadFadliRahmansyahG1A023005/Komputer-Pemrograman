import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Program Zodiac Finder!");
        System.out.print("Masukkan tanggal lahir (dd/mm): ");
        String inputTanggal = input.nextLine();

        String[] tanggalBulan = inputTanggal.split("/");
        if (tanggalBulan.length != 2) {
            System.out.println("Format tanggal tidak valid. Gunakan format dd/mm.");
            return;
        }

        int tanggal = Integer.parseInt(tanggalBulan[0]);
        int bulan = Integer.parseInt(tanggalBulan[1]);

        String zodiak = findZodiac(tanggal, bulan);

        if (zodiak != null) {
            System.out.println("Zodiak Anda adalah " + zodiak);
        } else {
            System.out.println("Tanggal lahir tidak valid.");
        }
    }

    public static String findZodiac(int day, int month) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Pisces";
        } else {
            return null;
        }
    }
}
