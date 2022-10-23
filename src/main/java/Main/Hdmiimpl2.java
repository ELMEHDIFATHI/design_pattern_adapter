package Main;

import java.nio.charset.StandardCharsets;

public class Hdmiimpl2 implements Hdmi {

    @Override
    public void afficher(byte[] data) {
        System.out.println("----------------------------------");
        System.out.println(new String(data, StandardCharsets.UTF_8));
        System.out.println("-----------------------------");
    }
}
