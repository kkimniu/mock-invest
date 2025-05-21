package io.cavia.mockinvest.dto.response;

public class KorStock213Output1 {

    private String stckPrdyClqr;
    private String stckPrpr;
    private String stckHgpr;
    private String acml_vol;

    public KorStock213Output1() {
    }

    public KorStock213Output1(String stckPrdyClqr, String stckPrpr, String stckHgpr, String acml_vol) {
        this.stckPrdyClqr = stckPrdyClqr;
        this.stckPrpr = stckPrpr;
        this.stckHgpr = stckHgpr;
        this.acml_vol = acml_vol;
    }

    public String getStckPrdyClqr() {
        return stckPrdyClqr;
    }

    public void setStckPrdyClqr(String stckPrdyClqr) {
        this.stckPrdyClqr = stckPrdyClqr;
    }

    public String getStckPrpr() {
        return stckPrpr;
    }

    public void setStckPrpr(String stckPrpr) {
        this.stckPrpr = stckPrpr;
    }

    public String getStckHgpr() {
        return stckHgpr;
    }

    public void setStckHgpr(String stckHgpr) {
        this.stckHgpr = stckHgpr;
    }

    public String getAcml_vol() {
        return acml_vol;
    }

    public void setAcml_vol(String acml_vol) {
        this.acml_vol = acml_vol;
    }
}
