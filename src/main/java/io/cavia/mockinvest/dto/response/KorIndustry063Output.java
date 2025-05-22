package io.cavia.mockinvest.dto.response;

public class KorIndustry063Output {

    private String bstpNmixPrpr;
    private String bstpNmixPrdyVrss;
    private String PrdyVrssSign;
    private String bstpNmixPrdyCtrt;

    public KorIndustry063Output() {
    }

    public KorIndustry063Output(String bstpNmixPrpr, String bstpNmixPrdyVrss, String prdyVrssSign, String bstpNmixPrdyCtrt) {
        this.bstpNmixPrpr = bstpNmixPrpr;
        this.bstpNmixPrdyVrss = bstpNmixPrdyVrss;
        PrdyVrssSign = prdyVrssSign;
        this.bstpNmixPrdyCtrt = bstpNmixPrdyCtrt;
    }

    public String getBstpNmixPrpr() {
        return bstpNmixPrpr;
    }

    public void setBstpNmixPrpr(String bstpNmixPrpr) {
        this.bstpNmixPrpr = bstpNmixPrpr;
    }

    public String getBstpNmixPrdyVrss() {
        return bstpNmixPrdyVrss;
    }

    public void setBstpNmixPrdyVrss(String bstpNmixPrdyVrss) {
        this.bstpNmixPrdyVrss = bstpNmixPrdyVrss;
    }

    public String getPrdyVrssSign() {
        return PrdyVrssSign;
    }

    public void setPrdyVrssSign(String prdyVrssSign) {
        PrdyVrssSign = prdyVrssSign;
    }

    public String getBstpNmixPrdyCtrt() {
        return bstpNmixPrdyCtrt;
    }

    public void setBstpNmixPrdyCtrt(String bstpNmixPrdyCtrt) {
        this.bstpNmixPrdyCtrt = bstpNmixPrdyCtrt;
    }
}
