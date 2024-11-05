package Singleton;

public class IPhoneSettings {

    private static IPhoneSettings instance;
    private int brightness;
    private boolean wifi;

    private IPhoneSettings() {
        this.brightness = 60;
        this.wifi = true;
    }

    public static IPhoneSettings getInstance(){
        if (instance == null){
            instance = new IPhoneSettings();

        }
        return instance;
    }
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getBrightness() {
        return brightness;
    }
    public void enableWiFi(){
        this.wifi = true;
    }
    public void disableWiFi(){
        this.wifi = false;
    }

//    @Override
//    public String toString() {
//        return "IPhoneSettings" +
//                "brightness: " + brightness +
//                " wifi is" + wifi;
//    }
    public String wifiStatus() {
        if (wifi) return "wifi enabled";
        else return "wifi disabled";
    }
}
