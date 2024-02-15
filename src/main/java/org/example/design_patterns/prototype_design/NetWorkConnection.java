package org.example.design_patterns.prototype_design;

public class NetWorkConnection implements Cloneable{

    private String ip;
    private String data;

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
        Thread.sleep(5000);
        // let example it takes 5 min to load
    }

    @Override
    public String toString() {
        return "NetWorkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public NetWorkConnection clone() {
        try {
            NetWorkConnection clone = (NetWorkConnection) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
