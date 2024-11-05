package Singleton;

public class Main {
    public static void main(String[] args) {
        IPhoneSettings iphone = IPhoneSettings.getInstance();
        iphone.setBrightness(99);
        iphone.disableWiFi();




//        System.out.println(iphone.toString());
        System.out.println(iphone.getBrightness());
        System.out.println(iphone.wifiStatus());
    }
}
