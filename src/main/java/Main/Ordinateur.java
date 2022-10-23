package Main;

public class Ordinateur {
    private Hdmi hdmi;

    public Hdmi getHdmi() {
        return hdmi;
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }

    public void afficher(byte[] data){
        hdmi.afficher(data);
    }
}
