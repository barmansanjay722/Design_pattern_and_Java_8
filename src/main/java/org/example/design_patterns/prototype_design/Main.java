package org.example.design_patterns.prototype_design;

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        System.out.println("Creating object using prototype desgin");

        NetWorkConnection netWorkConnection = new NetWorkConnection();

        netWorkConnection.setIp("192.168.4.4");
        netWorkConnection.loaddata();        // this take 5 min time , so let suppose want to create object again now we will create clone object by
                                            // prototype design


        NetWorkConnection netWorkConnection1 = null;
        netWorkConnection1 = (NetWorkConnection) netWorkConnection.clone();

        System.out.println(netWorkConnection);
        netWorkConnection.getDomains().remove(0);

        System.out.println(netWorkConnection);
        System.out.println(netWorkConnection1);
    }
}
