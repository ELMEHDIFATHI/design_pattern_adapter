package Main;

import Main.Hdmi;

import java.nio.charset.StandardCharsets;

public class Hdmiimpl implements Hdmi {

    @Override
    public void afficher(byte[] data) {
        System.out.println("***************HDMI *******");
        System.out.println(new String(data, StandardCharsets.UTF_8));
        System.out.println("***************HDMI *******");
    }
}
