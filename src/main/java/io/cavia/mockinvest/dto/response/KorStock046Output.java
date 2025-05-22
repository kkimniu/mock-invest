package io.cavia.mockinvest.dto.response;

public class KorStock046Output {

    private String frgnFakeNtbyQty;
    private String orgnFakeNtbyQty;
    private String sumFakeNtbyQty;

    public KorStock046Output() {
    }

    public KorStock046Output(String frgnFakeNtbyQty, String orgnFakeNtbyQty, String sumFakeNtbyQty) {
        this.frgnFakeNtbyQty = frgnFakeNtbyQty;
        this.orgnFakeNtbyQty = orgnFakeNtbyQty;
        this.sumFakeNtbyQty = sumFakeNtbyQty;
    }

    public String getFrgnFakeNtbyQty() {
        return frgnFakeNtbyQty;
    }

    public void setFrgnFakeNtbyQty(String frgnFakeNtbyQty) {
        this.frgnFakeNtbyQty = frgnFakeNtbyQty;
    }

    public String getOrgnFakeNtbyQty() {
        return orgnFakeNtbyQty;
    }

    public void setOrgnFakeNtbyQty(String orgnFakeNtbyQty) {
        this.orgnFakeNtbyQty = orgnFakeNtbyQty;
    }

    public String getSumFakeNtbyQty() {
        return sumFakeNtbyQty;
    }

    public void setSumFakeNtbyQty(String sumFakeNtbyQty) {
        this.sumFakeNtbyQty = sumFakeNtbyQty;
    }
}
