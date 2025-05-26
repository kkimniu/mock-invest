package io.cavia.mockinvest.dto.response;

public class KorStock150Output implements StockDtoOutput {

    private String totIssueStkQty;
    private String listDt;

    public KorStock150Output() {
    }

    public KorStock150Output(String totIssueStkQty, String listDt) {
        this.totIssueStkQty = totIssueStkQty;
        this.listDt = listDt;
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
