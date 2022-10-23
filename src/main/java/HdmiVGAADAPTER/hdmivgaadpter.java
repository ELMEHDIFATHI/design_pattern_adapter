package HdmiVGAADAPTER;

import Main.Hdmi;
import VGA.vga;

public class hdmivgaadpter implements Hdmi {

    private vga vga;
    @Override
    public void afficher(byte[] data) {
        String str=new String(data);
         vga.print(str);
    }

    public vga getVga() {
        return vga;
    }

    public  void setVga(vga vga) {
        this.vga = vga;
    }
}
