package Main;

import HdmiVGAADAPTER.hdmivgaadpter;
import VGA.vgaimpl;

import java.nio.charset.StandardCharsets;

public class test {

    public static void main(String[] args) {
        Ordinateur ordinateur=new Ordinateur();
        ordinateur.setHdmi(new Hdmiimpl());
        String str="Bonjour EMSI";
        ordinateur.afficher(str.getBytes());
        ordinateur.setHdmi(new Hdmiimpl2());
        String str2="Bonjour EMSI2";
        ordinateur.afficher(str2.getBytes());
        hdmivgaadpter a=new hdmivgaadpter();
        a.setVga(new vgaimpl());
        ordinateur.setHdmi(a);
        ordinateur.afficher(str.getBytes());


    }
}
