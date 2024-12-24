package java.com.zafran;
import java.com.zafran.Main;
public class PersonAppp {
    private String nama;
    private String alamat;

    public static void main(String[] args) {

        var person1 = new PersonAppp();
        person1.nama = "ammar";
        person1.alamat = "jakarta";

        System.out.println(person1.nama);
        System.out.println(person1.alamat);
    }
}