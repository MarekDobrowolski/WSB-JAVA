package devices;

import com.company.salleable;


import com.company.Human;

import java.net.URL;
import java.util.List;

public class Phone extends Device implements salleable {

    static final String defaultServer = "https://googleplay.com/redtube/v3.5";

    public void turnOn() {
        System.out.println("Processor starts");
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            seller.phone = null;
            buyer.phone = this;
            System.out.println(buyer + " buy " + this + " from " + seller + " for " + price);
        } else {
            System.out.println("Transaction failed");
        }
    }

    public void installAnnApp(String appName) {
        System.out.println(appName + " installed.");
    }

    public void installAnnApp(String appName, String versionName) {
        System.out.println(appName + "v. " + versionName + " installed.");
    }

    public void installAnnApp(String appName, String versionName, String serverAddress) {
        System.out.println(appName + "v. " + versionName + "from server : " + serverAddress + " installed.");
    }

    public void installAnnApp(List<String> appsToInstall) {
        System.out.println(appsToInstall + " installed.");
    }

    public void installAnnApp(URL url) {
        System.out.println("App from " + url.getPath());
    }

}


