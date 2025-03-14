import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File si;
        String home = System.getProperty("user.home");
        System.out.println(home);
        String rutaCompleta = home+File.separator+"Downloads";
        System.out.println(rutaCompleta);

        si = new File(rutaCompleta);
        System.out.println(si.getAbsolutePath());
    }
}