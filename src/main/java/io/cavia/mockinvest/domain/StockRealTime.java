package io.cavia.mockinvest.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "stock_real_time")
public class StockRealTime {

    @Column(name = "mksc_shrn_iscd", length = 9, nullable = false)
    private String mkscShrnIscd;

    @Id
    @Column(name = "stck_cntg_hour", length = 6, nullable = false)
    private String stckCntgHour;

    @Column(name = "stck_prpr", nullable = false)
    private Integer stckPrpr;

    @Column(name = "prdy_vrss_sign", length = 1, nullable = false)
    private String prdyVrssSign;

    @Column(name = "prdy_vrss", nullable = false)
    private Integer prdyVrss;

    @Column(name = "prdy_ctrt", precision = 8, scale = 2, nullable = false)
    private BigDecimal prdyCtrt;

    @Column(name = "wghn_avrg_stck_prc", precision = 12, scale = 2, nullable = false)
    private BigDecimal wghnAvrgStckPrc;

    @Column(name = "stck_oprc", nullable = false)
    private Integer stckOprc;

    @Column(name = "stck_hgpr", nullable = false)
    private Integer stckHgpr;

    @Column(name = "stck_lwpr", nullable = false)
    private Integer stckLwpr;

    @Column(name = "askp1", nullable = false)
    private Integer askp1;

    @Column(name = "bidp1", nullable = false)
    private Integer bidp1;

    @Column(name = "cntg_vol", nullable = false)
    private Long cntgVol;

    @Column(name = "acml_vol", nullable = false)
    private Long acmlVol;

    @Column(name = "acml_tr_pbmn", nullable = false)
    private Long acmlTrPbmn;

    @Column(name = "seln_cntg_csnu", nullable = false)
    private Integer selnCntgCsnu;

    @Column(name = "shnu_cntg_csnu", nullable = false)
    private Integer shnuCntgCsnu;

    @Column(name = "ntby_cntg_csnu", nullable = false)
    private Integer ntbyCntgCsnu;

    @Column(name = "cttr", precision = 8, scale = 2, nullable = false)
    private BigDecimal cttr;

    @Column(name = "seln_cntg_smtn", nullable = false)
    private Long selnCntgSmtn;

    @Column(name = "shnu_cntg_smtn", nullable = false)
    private Long shnuCntgSmtn;

    @Column(name = "ccld_dvsn", length = 1, nullable = false)
    private String ccldDvsn;

    @Column(name = "shnu_rate", precision = 8, scale = 2, nullable = false)
    private BigDecimal shnuRate;

    @Column(name = "prdy_vol_vrss_acml_vol_rate", precision = 8, scale = 2, nullable = false)
    private BigDecimal prdyVolVrssAcmlVolRate;

    @Column(name = "oprc_hour", length = 6, nullable = false)
    private String oprcHour;

    @Column(name = "oprc_vrss_prpr_sign", length = 1, nullable = false)
    private String oprcVrssPrprSign;

    @Column(name = "oprc_vrss_prpr", nullable = false)
    private Integer oprcVrssPrpr;

    @Column(name = "hgpr_hour", length = 6, nullable = false)
    private String hgprHour;

    @Column(name = "hgpr_vrss_prpr_sign", length = 1, nullable = false)
    private String hgprVrssPrprSign;

    @Column(name = "hgpr_vrss_prpr", nullable = false)
    private Integer hgprVrssPrpr;

    @Column(name = "lwpr_hour", length = 6, nullable = false)
    private String lwprHour;

    @Column(name = "lwpr_vrss_prpr_sign", length = 1, nullable = false)
    private String lwprVrssPrprSign;

    @Column(name = "lwpr_vrss_prpr", nullable = false)
    private Integer lwprVrssPrpr;

    @Column(name = "bsop_date", length = 8, nullable = false)
    private String bsopDate;

    @Column(name = "new_mkop_cls_code", length = 2, nullable = false)
    private String newMkopClsCode;

    @Column(name = "trht_yn", length = 1, nullable = false)
    private String trhtYn;

    @Column(name = "askp_rsqn1", nullable = false)
    private Long askpRsqn1;

    @Column(name = "bidp_rsqn1", nullable = false)
    private Long bidpRsqn1;

    @Column(name = "total_askp_rsqn", nullable = false)
    private Long totalAskpRsqn;

    @Column(name = "total_bidp_rsqn", nullable = false)
    private Long totalBidpRsqn;

    @Column(name = "vol_tnrt", precision = 8, scale = 2, nullable = false)
    private BigDecimal volTnrt;

    @Column(name = "prdy_smns_hour_acml_vol", nullable = false)
    private Long prdySmnsHourAcmlVol;

    @Column(name = "prdy_smns_hour_acml_vol_rate", precision = 8, scale = 2, nullable = false)
    private BigDecimal prdySmnsHourAcmlVolRate;

    @Column(name = "hour_cls_code", length = 1, nullable = false)
    private String hourClsCode;

    @Column(name = "mrkt_trtm_cls_code", length = 1, nullable = false)
    private String mrktTrtmClsCode;

    @Column(name = "vi_stnd_prc", nullable = false)
    private Integer viStndPrc;

    public StockRealTime() {
    }

    public StockRealTime(String mkscShrnIscd, String stckCntgHour, Integer stckPrpr, String prdyVrssSign, Integer prdyVrss,
                         BigDecimal prdyCtrt, BigDecimal wghnAvrgStckPrc, Integer stckOprc, Integer stckHgpr, Integer stckLwpr,
                         Integer askp1, Integer bidp1, Long cntgVol, Long acmlVol, Long acmlTrPbmn, Integer selnCntgCsnu,
                         Integer shnuCntgCsnu, Integer ntbyCntgCsnu, BigDecimal cttr, Long selnCntgSmtn, Long shnuCntgSmtn,
                         String ccldDvsn, BigDecimal shnuRate, BigDecimal prdyVolVrssAcmlVolRate, String oprcHour,
                         String oprcVrssPrprSign, Integer oprcVrssPrpr, String hgprHour, String hgprVrssPrprSign,
                         Integer hgprVrssPrpr, String lwprHour, String lwprVrssPrprSign, Integer lwprVrssPrpr, String bsopDate,
                         String newMkopClsCode, String trhtYn, Long askpRsqn1, Long bidpRsqn1, Long totalAskpRsqn,
                         Long totalBidpRsqn, BigDecimal volTnrt, Long prdySmnsHourAcmlVol, BigDecimal prdySmnsHourAcmlVolRate,
                         String hourClsCode, String mrktTrtmClsCode, Integer viStndPrc) {

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

    public Integer getStckPrpr() {
        return stckPrpr;
    }

    public void setStckPrpr(Integer stckPrpr) {
        this.stckPrpr = stckPrpr;
    }

    public String getPrdyVrssSign() {
        return prdyVrssSign;
    }

    public void setPrdyVrssSign(String prdyVrssSign) {
        this.prdyVrssSign = prdyVrssSign;
    }

    public Integer getPrdyVrss() {
        return prdyVrss;
    }

    public void setPrdyVrss(Integer prdyVrss) {
        this.prdyVrss = prdyVrss;
    }

    public BigDecimal getPrdyCtrt() {
        return prdyCtrt;
    }

    public void setPrdyCtrt(BigDecimal prdyCtrt) {
        this.prdyCtrt = prdyCtrt;
    }

    public BigDecimal getWghnAvrgStckPrc() {
        return wghnAvrgStckPrc;
    }

    public void setWghnAvrgStckPrc(BigDecimal wghnAvrgStckPrc) {
        this.wghnAvrgStckPrc = wghnAvrgStckPrc;
    }

    public Integer getStckOprc() {
        return stckOprc;
    }

    public void setStckOprc(Integer stckOprc) {
        this.stckOprc = stckOprc;
    }

    public Integer getStckHgpr() {
        return stckHgpr;
    }

    public void setStckHgpr(Integer stckHgpr) {
        this.stckHgpr = stckHgpr;
    }

    public Integer getStckLwpr() {
        return stckLwpr;
    }

    public void setStckLwpr(Integer stckLwpr) {
        this.stckLwpr = stckLwpr;
    }

    public Integer getAskp1() {
        return askp1;
    }

    public void setAskp1(Integer askp1) {
        this.askp1 = askp1;
    }

    public Integer getBidp1() {
        return bidp1;
    }

    public void setBidp1(Integer bidp1) {
        this.bidp1 = bidp1;
    }

    public Long getCntgVol() {
        return cntgVol;
    }

    public void setCntgVol(Long cntgVol) {
        this.cntgVol = cntgVol;
    }

    public Long getAcmlVol() {
        return acmlVol;
    }

    public void setAcmlVol(Long acmlVol) {
        this.acmlVol = acmlVol;
    }

    public Long getAcmlTrPbmn() {
        return acmlTrPbmn;
    }

    public void setAcmlTrPbmn(Long acmlTrPbmn) {
        this.acmlTrPbmn = acmlTrPbmn;
    }

    public Integer getSelnCntgCsnu() {
        return selnCntgCsnu;
    }

    public void setSelnCntgCsnu(Integer selnCntgCsnu) {
        this.selnCntgCsnu = selnCntgCsnu;
    }

    public Integer getShnuCntgCsnu() {
        return shnuCntgCsnu;
    }

    public void setShnuCntgCsnu(Integer shnuCntgCsnu) {
        this.shnuCntgCsnu = shnuCntgCsnu;
    }

    public Integer getNtbyCntgCsnu() {
        return ntbyCntgCsnu;
    }

    public void setNtbyCntgCsnu(Integer ntbyCntgCsnu) {
        this.ntbyCntgCsnu = ntbyCntgCsnu;
    }

    public BigDecimal getCttr() {
        return cttr;
    }

    public void setCttr(BigDecimal cttr) {
        this.cttr = cttr;
    }

    public Long getSelnCntgSmtn() {
        return selnCntgSmtn;
    }

    public void setSelnCntgSmtn(Long selnCntgSmtn) {
        this.selnCntgSmtn = selnCntgSmtn;
    }

    public Long getShnuCntgSmtn() {
        return shnuCntgSmtn;
    }

    public void setShnuCntgSmtn(Long shnuCntgSmtn) {
        this.shnuCntgSmtn = shnuCntgSmtn;
    }

    public String getCcldDvsn() {
        return ccldDvsn;
    }

    public void setCcldDvsn(String ccldDvsn) {
        this.ccldDvsn = ccldDvsn;
    }

    public BigDecimal getShnuRate() {
        return shnuRate;
    }

    public void setShnuRate(BigDecimal shnuRate) {
        this.shnuRate = shnuRate;
    }

    public BigDecimal getPrdyVolVrssAcmlVolRate() {
        return prdyVolVrssAcmlVolRate;
    }

    public void setPrdyVolVrssAcmlVolRate(BigDecimal prdyVolVrssAcmlVolRate) {
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

    public Integer getOprcVrssPrpr() {
        return oprcVrssPrpr;
    }

    public void setOprcVrssPrpr(Integer oprcVrssPrpr) {
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

    public Integer getHgprVrssPrpr() {
        return hgprVrssPrpr;
    }

    public void setHgprVrssPrpr(Integer hgprVrssPrpr) {
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

    public Integer getLwprVrssPrpr() {
        return lwprVrssPrpr;
    }

    public void setLwprVrssPrpr(Integer lwprVrssPrpr) {
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

    public Long getAskpRsqn1() {
        return askpRsqn1;
    }

    public void setAskpRsqn1(Long askpRsqn1) {
        this.askpRsqn1 = askpRsqn1;
    }

    public Long getBidpRsqn1() {
        return bidpRsqn1;
    }

    public void setBidpRsqn1(Long bidpRsqn1) {
        this.bidpRsqn1 = bidpRsqn1;
    }

    public Long getTotalAskpRsqn() {
        return totalAskpRsqn;
    }

    public void setTotalAskpRsqn(Long totalAskpRsqn) {
        this.totalAskpRsqn = totalAskpRsqn;
    }

    public Long getTotalBidpRsqn() {
        return totalBidpRsqn;
    }

    public void setTotalBidpRsqn(Long totalBidpRsqn) {
        this.totalBidpRsqn = totalBidpRsqn;
    }

    public BigDecimal getVolTnrt() {
        return volTnrt;
    }

    public void setVolTnrt(BigDecimal volTnrt) {
        this.volTnrt = volTnrt;
    }

    public Long getPrdySmnsHourAcmlVol() {
        return prdySmnsHourAcmlVol;
    }

    public void setPrdySmnsHourAcmlVol(Long prdySmnsHourAcmlVol) {
        this.prdySmnsHourAcmlVol = prdySmnsHourAcmlVol;
    }

    public BigDecimal getPrdySmnsHourAcmlVolRate() {
        return prdySmnsHourAcmlVolRate;
    }

    public void setPrdySmnsHourAcmlVolRate(BigDecimal prdySmnsHourAcmlVolRate) {
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

    public Integer getViStndPrc() {
        return viStndPrc;
    }

    public void setViStndPrc(Integer viStndPrc) {
        this.viStndPrc = viStndPrc;
    }
}

