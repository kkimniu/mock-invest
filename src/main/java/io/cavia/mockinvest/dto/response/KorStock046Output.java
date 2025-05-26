package io.cavia.mockinvest.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorStock046Output implements StockDtoOutput {

    @JsonProperty("frgn_fake_ntby_qty")
    private String frgnFakeNtbyQty;
    @JsonProperty("orgn_fake_ntby_qty")
    private String orgnFakeNtbyQty;
    @JsonProperty("sum_fake_ntby_qty")
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
