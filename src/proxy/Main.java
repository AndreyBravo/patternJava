package proxy;

import proxy.myClass.VPN;
import proxy.myInterface.ILink;

public class Main {
    public static void main(String[] args) {
        ILink link = new VPN("www.google.com");

        link.getLink();
    }
}
