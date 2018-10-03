package com.runninplugins.runninperms.types;

public class Prefixes {

    private String prefixName;
    private int prefixRanking;

    public Prefixes(String prefixName, int prefixRanking){
        this.prefixName = prefixName;
        this.prefixRanking = prefixRanking;

    }

    public int getPrefixRanking() {
        return prefixRanking;
    }

    public void setPrefixRanking(int prefixRanking) {
        this.prefixRanking = prefixRanking;
    }

    public String getPrefixName() {
        return prefixName;
    }

    public void setPrefixName(String prefixName) {
        this.prefixName = prefixName;
    }
}
