package VGA;

import java.util.Locale;

public class vgaimpl implements vga{
    @Override
    public void print(String str) {
        System.out.println("########################");
        System.out.println(str.toUpperCase());
        System.out.println("########################");
    }
}
