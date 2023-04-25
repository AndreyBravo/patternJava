package proxy.myClass;

import proxy.myInterface.ILink;

public class Browser implements ILink {
    private String url;

    public Browser(String url) {
        this.url = url;
    }

    @Override
    public void getLink() {
        System.out.println("Run browser...");
    }
}
