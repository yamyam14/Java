public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }
        long longKiloBytes = kiloBytes;
        int megaBytes = kiloBytes/1024;
        int remainder = kiloBytes%1024;
        System.out.println(longKiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
    }
}
