package proxy.myClass;

import proxy.myInterface.ILink;

public class VPN implements ILink {
    private String url;
    private Browser browser;

    public VPN(String url) {
        this.url = url;
    }

    @Override
    public void getLink() {
        if(browser == null)
            browser = new Browser(this.url);
        browser.getLink();
    }
}
