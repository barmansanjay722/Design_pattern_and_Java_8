package org.example.design_patterns.prototype_design;

import java.util.ArrayList;
import java.util.List;

public class NetWorkConnection implements Cloneable{

    private String ip;
    private String data;
    private List<String> domains =  new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void loaddata() throws InterruptedException {
        this.data = "very important data";

        domains.add("www.sanjay.com");
        domains.add("www.google.com");
        domains.add("www.dumydomain.com");

        Thread.sleep(5000);
        // let example it takes 5 min to load
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "NetWorkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                ", domains='" + domains + '\'' +
                '}';
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
//        NetWorkConnection clone = (NetWorkConnection) super.clone();

        // this is Custom cloing for deep copy
        NetWorkConnection netWorkConnection = new NetWorkConnection();
        netWorkConnection.setIp(this.getIp());
        netWorkConnection.setData(this.getData());
        netWorkConnection.setDomains(new ArrayList<>(this.getDomains()));

        return netWorkConnection;
//        return clone;
    }
}
