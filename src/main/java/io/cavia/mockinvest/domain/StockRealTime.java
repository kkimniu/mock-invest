package io.cavia.mockinvest.domain;

public class StockRealTime {

    private String mkscShrnIscd;                       // 유가증권 단축 종목코드
    private String stckCntgHour;                       // 주식 체결 시간
    private String stckPrpr;                           // 주식 현재가
    private String prdyVrssSign;                       // 전일 대비 부호
    private String prdyVrss;                           // 전일 대비
    private String prdyCtrt;                           // 전일 대비율
    private String wghnAvrgStckPrc;                    // 가중 평균 주식 가격
    private String stckOprc;                           // 주식 시가
    private String stckHgpr;                           // 주식 최고가
    private String stckLwpr;                           // 주식 최저가
    private String askp1;                              // 매도호가1
    private String bidp1;                              // 매수호가1
    private String cntgVol;                            // 체결 거래량
    private String acmlVol;                            // 누적 거래량
    private String acmlTrPbmn;                         // 누적 거래 대금
    private String selnCntgCsnu;                       // 매도 체결 건수
    private String shnuCntgCsnu;                       // 매수 체결 건수
    private String ntbyCntgCsnu;                       // 순매수 체결 건수
    private String cttr;                               // 체결강도
    private String selnCntgSmtn;                       // 총 매도 수량
    private String shnuCntgSmtn;                       // 총 매수 수량
    private String ccldDvsn;                           // 체결구분
    private String shnuRate;                           // 매수비율
    private String prdyVolVrssAcmlVolRate;             // 전일 거래량 대비 등락율
    private String oprcHour;                           // 시가 시간
    private String oprcVrssPrprSign;                   // 시가대비구분
    private String oprcVrssPrpr;                       // 시가대비
    private String hgprHour;                           // 최고가 시간
    private String hgprVrssPrprSign;                   // 고가대비구분
    private String hgprVrssPrpr;                       // 고가대비
    private String lwprHour;                           // 최저가 시간
    private String lwprVrssPrprSign;                   // 저가대비구분
    private String lwprVrssPrpr;                       // 저가대비
    private String bsopDate;                           // 영업 일자
    private String newMkopClsCode;                     // 신 장운영 구분 코드
    private String trhtYn;                             // 거래정지 여부
    private String askpRsqn1;                          // 매도호가 잔량1
    private String bidpRsqn1;                          // 매수호가 잔량1
    private String totalAskpRsqn;                      // 총 매도호가 잔량
    private String totalBidpRsqn;                      // 총 매수호가 잔량
    private String volTnrt;                            // 거래량 회전율
    private String prdySmnsHourAcmlVol;                // 전일 동시간 누적 거래량
    private String prdySmnsHourAcmlVolRate;            // 전일 동시간 누적 거래량 비율
    private String hourClsCode;                        // 시간 구분 코드
    private String mrktTrtmClsCode;                    // 임의종료구분코드
    private String viStndPrc;

    public StockRealTime() {
    }

    public StockRealTime(String mkscShrnIscd, String stckCntgHour, String stckPrpr, String prdyVrssSign,
                         String prdyVrss, String prdyCtrt, String wghnAvrgStckPrc, String stckOprc,
                         String stckHgpr, String stckLwpr, String askp1, String bidp1, String cntgVol,
                         String acmlVol, String acmlTrPbmn, String selnCntgCsnu, String shnuCntgCsnu,
                         String ntbyCntgCsnu, String cttr, String selnCntgSmtn, String shnuCntgSmtn,
                         String ccldDvsn, String shnuRate, String prdyVolVrssAcmlVolRate, String oprcHour,
                         String oprcVrssPrprSign, String oprcVrssPrpr, String hgprHour, String hgprVrssPrprSign,
                         String hgprVrssPrpr, String lwprHour, String lwprVrssPrprSign, String lwprVrssPrpr,
                         String bsopDate, String newMkopClsCode, String trhtYn, String askpRsqn1, String bidpRsqn1,
                         String totalAskpRsqn, String totalBidpRsqn, String volTnrt, String prdySmnsHourAcmlVol,
                         String prdySmnsHourAcmlVolRate, String hourClsCode, String mrktTrtmClsCode, String viStndPrc) {
        this.mkscShrnIscd = mkscShrnIscd;
        this.stckCntgHour = stckCntgHour;
        this.stckPrpr = stckPrpr;
        this.prdyVrssSign = prdyVrssSign;
        this.prdyVrss = prdyVrss;
        this.prdyCtrt = prdyCtrt;
        this.wghnAvrgStckPrc = wghnAvrgStckPrc;
        this.stckOprc = stckOprc;
        this.stckHgpr = stckHgpr;
        this.stckLwpr = stckLwpr;
        this.askp1 = askp1;
        this.bidp1 = bidp1;
        this.cntgVol = cntgVol;
        this.acmlVol = acmlVol;
        this.acmlTrPbmn = acmlTrPbmn;
        this.selnCntgCsnu = selnCntgCsnu;
        this.shnuCntgCsnu = shnuCntgCsnu;
        this.ntbyCntgCsnu = ntbyCntgCsnu;
        this.cttr = cttr;
        this.selnCntgSmtn = selnCntgSmtn;
        this.shnuCntgSmtn = shnuCntgSmtn;
        this.ccldDvsn = ccldDvsn;
        this.shnuRate = shnuRate;
        this.prdyVolVrssAcmlVolRate = prdyVolVrssAcmlVolRate;
        this.oprcHour = oprcHour;
        this.oprcVrssPrprSign = oprcVrssPrprSign;
        this.oprcVrssPrpr = oprcVrssPrpr;
        this.hgprHour = hgprHour;
        this.hgprVrssPrprSign = hgprVrssPrprSign;
        this.hgprVrssPrpr = hgprVrssPrpr;
        this.lwprHour = lwprHour;
        this.lwprVrssPrprSign = lwprVrssPrprSign;
        this.lwprVrssPrpr = lwprVrssPrpr;
        this.bsopDate = bsopDate;
        this.newMkopClsCode = newMkopClsCode;
        this.trhtYn = trhtYn;
        this.askpRsqn1 = askpRsqn1;
        this.bidpRsqn1 = bidpRsqn1;
        this.totalAskpRsqn = totalAskpRsqn;
        this.totalBidpRsqn = totalBidpRsqn;
        this.volTnrt = volTnrt;
        this.prdySmnsHourAcmlVol = prdySmnsHourAcmlVol;
        this.prdySmnsHourAcmlVolRate = prdySmnsHourAcmlVolRate;
        this.hourClsCode = hourClsCode;
        this.mrktTrtmClsCode = mrktTrtmClsCode;
        this.viStndPrc = viStndPrc;
    }

    public String getMkscShrnIscd() {
        return mkscShrnIscd;
    }

    public void setMkscShrnIscd(String mkscShrnIscd) {
        this.mkscShrnIscd = mkscShrnIscd;
    }

    public String getStckCntgHour() {
        return stckCntgHour;
    }

    public void setStckCntgHour(String stckCntgHour) {
        this.stckCntgHour = stckCntgHour;
    }

    public String getStckPrpr() {
        return stckPrpr;
    }

    public void setStckPrpr(String stckPrpr) {
        this.stckPrpr = stckPrpr;
    }

    public String getPrdyVrssSign() {
        return prdyVrssSign;
    }

    public void setPrdyVrssSign(String prdyVrssSign) {
        this.prdyVrssSign = prdyVrssSign;
    }

    public String getPrdyVrss() {
        return prdyVrss;
    }

    public void setPrdyVrss(String prdyVrss) {
        this.prdyVrss = prdyVrss;
    }

    public String getPrdyCtrt() {
        return prdyCtrt;
    }

    public void setPrdyCtrt(String prdyCtrt) {
        this.prdyCtrt = prdyCtrt;
    }

    public String getWghnAvrgStckPrc() {
        return wghnAvrgStckPrc;
    }

    public void setWghnAvrgStckPrc(String wghnAvrgStckPrc) {
        this.wghnAvrgStckPrc = wghnAvrgStckPrc;
    }

    public String getStckOprc() {
        return stckOprc;
    }

    public void setStckOprc(String stckOprc) {
        this.stckOprc = stckOprc;
    }

    public String getStckHgpr() {
        return stckHgpr;
    }

    public void setStckHgpr(String stckHgpr) {
        this.stckHgpr = stckHgpr;
    }

    public String getStckLwpr() {
        return stckLwpr;
    }

    public void setStckLwpr(String stckLwpr) {
        this.stckLwpr = stckLwpr;
    }

    public String getAskp1() {
        return askp1;
    }

    public void setAskp1(String askp1) {
        this.askp1 = askp1;
    }

    public String getBidp1() {
        return bidp1;
    }

    public void setBidp1(String bidp1) {
        this.bidp1 = bidp1;
    }

    public String getCntgVol() {
        return cntgVol;
    }

    public void setCntgVol(String cntgVol) {
        this.cntgVol = cntgVol;
    }

    public String getAcmlVol() {
        return acmlVol;
    }

    public void setAcmlVol(String acmlVol) {
        this.acmlVol = acmlVol;
    }

    public String getAcmlTrPbmn() {
        return acmlTrPbmn;
    }

    public void setAcmlTrPbmn(String acmlTrPbmn) {
        this.acmlTrPbmn = acmlTrPbmn;
    }

    public String getSelnCntgCsnu() {
        return selnCntgCsnu;
    }

    public void setSelnCntgCsnu(String selnCntgCsnu) {
        this.selnCntgCsnu = selnCntgCsnu;
    }

    public String getShnuCntgCsnu() {
        return shnuCntgCsnu;
    }

    public void setShnuCntgCsnu(String shnuCntgCsnu) {
        this.shnuCntgCsnu = shnuCntgCsnu;
    }

    public String getNtbyCntgCsnu() {
        return ntbyCntgCsnu;
    }

    public void setNtbyCntgCsnu(String ntbyCntgCsnu) {
        this.ntbyCntgCsnu = ntbyCntgCsnu;
    }

    public String getCttr() {
        return cttr;
    }

    public void setCttr(String cttr) {
        this.cttr = cttr;
    }

    public String getSelnCntgSmtn() {
        return selnCntgSmtn;
    }

    public void setSelnCntgSmtn(String selnCntgSmtn) {
        this.selnCntgSmtn = selnCntgSmtn;
    }

    public String getShnuCntgSmtn() {
        return shnuCntgSmtn;
    }

    public void setShnuCntgSmtn(String shnuCntgSmtn) {
        this.shnuCntgSmtn = shnuCntgSmtn;
    }

    public String getCcldDvsn() {
        return ccldDvsn;
    }

    public void setCcldDvsn(String ccldDvsn) {
        this.ccldDvsn = ccldDvsn;
    }

    public String getShnuRate() {
        return shnuRate;
    }

    public void setShnuRate(String shnuRate) {
        this.shnuRate = shnuRate;
    }

    public String getPrdyVolVrssAcmlVolRate() {
        return prdyVolVrssAcmlVolRate;
    }

    public void setPrdyVolVrssAcmlVolRate(String prdyVolVrssAcmlVolRate) {
        this.prdyVolVrssAcmlVolRate = prdyVolVrssAcmlVolRate;
    }

    public String getOprcHour() {
        return oprcHour;
    }

    public void setOprcHour(String oprcHour) {
        this.oprcHour = oprcHour;
    }

    public String getOprcVrssPrprSign() {
        return oprcVrssPrprSign;
    }

    public void setOprcVrssPrprSign(String oprcVrssPrprSign) {
        this.oprcVrssPrprSign = oprcVrssPrprSign;
    }

    public String getOprcVrssPrpr() {
        return oprcVrssPrpr;
    }

    public void setOprcVrssPrpr(String oprcVrssPrpr) {
        this.oprcVrssPrpr = oprcVrssPrpr;
    }

    public String getHgprHour() {
        return hgprHour;
    }

    public void setHgprHour(String hgprHour) {
        this.hgprHour = hgprHour;
    }

    public String getHgprVrssPrprSign() {
        return hgprVrssPrprSign;
    }

    public void setHgprVrssPrprSign(String hgprVrssPrprSign) {
        this.hgprVrssPrprSign = hgprVrssPrprSign;
    }

    public String getHgprVrssPrpr() {
        return hgprVrssPrpr;
    }

    public void setHgprVrssPrpr(String hgprVrssPrpr) {
        this.hgprVrssPrpr = hgprVrssPrpr;
    }

    public String getLwprHour() {
        return lwprHour;
    }

    public void setLwprHour(String lwprHour) {
        this.lwprHour = lwprHour;
    }

    public String getLwprVrssPrprSign() {
        return lwprVrssPrprSign;
    }

    public void setLwprVrssPrprSign(String lwprVrssPrprSign) {
        this.lwprVrssPrprSign = lwprVrssPrprSign;
    }

    public String getLwprVrssPrpr() {
        return lwprVrssPrpr;
    }

    public void setLwprVrssPrpr(String lwprVrssPrpr) {
        this.lwprVrssPrpr = lwprVrssPrpr;
    }

    public String getBsopDate() {
        return bsopDate;
    }

    public void setBsopDate(String bsopDate) {
        this.bsopDate = bsopDate;
    }

    public String getNewMkopClsCode() {
        return newMkopClsCode;
    }

    public void setNewMkopClsCode(String newMkopClsCode) {
        this.newMkopClsCode = newMkopClsCode;
    }

    public String getTrhtYn() {
        return trhtYn;
    }

    public void setTrhtYn(String trhtYn) {
        this.trhtYn = trhtYn;
    }

    public String getAskpRsqn1() {
        return askpRsqn1;
    }

    public void setAskpRsqn1(String askpRsqn1) {
        this.askpRsqn1 = askpRsqn1;
    }

    public String getBidpRsqn1() {
        return bidpRsqn1;
    }

    public void setBidpRsqn1(String bidpRsqn1) {
        this.bidpRsqn1 = bidpRsqn1;
    }

    public String getTotalAskpRsqn() {
        return totalAskpRsqn;
    }

    public void setTotalAskpRsqn(String totalAskpRsqn) {
        this.totalAskpRsqn = totalAskpRsqn;
    }

    public String getTotalBidpRsqn() {
        return totalBidpRsqn;
    }

    public void setTotalBidpRsqn(String totalBidpRsqn) {
        this.totalBidpRsqn = totalBidpRsqn;
    }

    public String getVolTnrt() {
        return volTnrt;
    }

    public void setVolTnrt(String volTnrt) {
        this.volTnrt = volTnrt;
    }

    public String getPrdySmnsHourAcmlVol() {
        return prdySmnsHourAcmlVol;
    }

    public void setPrdySmnsHourAcmlVol(String prdySmnsHourAcmlVol) {
        this.prdySmnsHourAcmlVol = prdySmnsHourAcmlVol;
    }

    public String getPrdySmnsHourAcmlVolRate() {
        return prdySmnsHourAcmlVolRate;
    }

    public void setPrdySmnsHourAcmlVolRate(String prdySmnsHourAcmlVolRate) {
        this.prdySmnsHourAcmlVolRate = prdySmnsHourAcmlVolRate;
    }

    public String getHourClsCode() {
        return hourClsCode;
    }

    public void setHourClsCode(String hourClsCode) {
        this.hourClsCode = hourClsCode;
    }

    public String getMrktTrtmClsCode() {
        return mrktTrtmClsCode;
    }

    public void setMrktTrtmClsCode(String mrktTrtmClsCode) {
        this.mrktTrtmClsCode = mrktTrtmClsCode;
    }

    public String getViStndPrc() {
        return viStndPrc;
    }

    public void setViStndPrc(String viStndPrc) {
        this.viStndPrc = viStndPrc;
    }


}
