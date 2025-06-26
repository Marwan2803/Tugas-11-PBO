import java.io.*;


public class MenulisFile {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("file.txt");
            f.write("Belajar Pemrograman File Handling");
            f.close();
            System.out.println("Proses Berhasil");

        }
        catch (IOException e) {
            System.out.println("Terjadi kesalahan dalam penulisan file.");
            e.printStackTrace();
        }
    }
}
