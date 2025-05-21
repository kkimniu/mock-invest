package io.cavia.mockinvest.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorStock150Dto {
    /**
     * 예탁원정보(상장정보일정)Dto입니다
     */
    @JsonProperty("output1")
    private KorStock145Output output;
    @JsonProperty("tot_issue_stk_qty")
    private String totIssueStkQty;
    @JsonProperty("list_dt")
    private String listDt;

    public KorStock150Dto() {
    }

    public KorStock150Dto(KorStock145Output output, String totIssueStkQty, String listDt) {
        this.output = output;
        this.totIssueStkQty = totIssueStkQty;
        this.listDt = listDt;
    }

    public KorStock145Output getOutput() {
        return output;
    }

    public void setOutput(KorStock145Output output) {
        this.output = output;
    }

    public String getTotIssueStkQty() {
        return totIssueStkQty;
    }

    public void setTotIssueStkQty(String totIssueStkQty) {
        this.totIssueStkQty = totIssueStkQty;
    }

    public String getListDt() {
        return listDt;
    }

    public void setListDt(String listDt) {
        this.listDt = listDt;
    }
}
