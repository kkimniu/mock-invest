package io.cavia.mockinvest.mapper;

import io.cavia.mockinvest.domain.StockRealTime;

import java.math.BigDecimal;

public class KorStockRealTimeMapper {
    /**
     * 국내주식 실시간체결가 요청으로 발생하는 dvs를 Entity로 변환하는 메서드 입니다
     * dvs는 '^'를 구분자로 가지고 45개의 데이터가 매핑되어 있습니다
     * 확인 결과 null로 전달 되는 값과 각각 다른 타입으로 파싱해야 하는 데이터가 있어서
     * 추후 보수를 고려하여 가장 원시적인 형태로 메서드를 작성하였습니다
     *
     * @param dvs
     * @return
     */
    public StockRealTime toEntity(String dvs) {
        String[] datas = dvs.split("^");
        datas[0] = datas[0].substring(datas[0].lastIndexOf("|"));

        return new StockRealTime(
                datas[0],  // mkscShrnIscd
                datas[1],  // stckCntgHour
                Integer.parseInt(datas[2]),  // stckPrpr
                datas[3], // prdyVrssSign
                Integer.parseInt(datas[4]),  // prdyVrss
                new BigDecimal(datas[5]),  // prdyCtrt
                new BigDecimal(datas[6]),  // wghnAvrgStckPrc
                Integer.parseInt(datas[7]),  // stckOprc
                Integer.parseInt(datas[8]),  // stckHgpr
                Integer.parseInt(datas[9]),  // stckLwpr
                Integer.parseInt(datas[10]), // askp1
                Integer.parseInt(datas[11]), // bidp1
                Long.parseLong(datas[12]), // cntgVol
                Long.parseLong(datas[13]), // acmlVol
                Long.parseLong(datas[14]), // acmlTrPbmn
                Integer.parseInt(datas[15]), // selnCntgCsnu
                Integer.parseInt(datas[16]), // shnuCntgCsnu
                Integer.parseInt(datas[17]), // ntbyCntgCsnu
                new BigDecimal(datas[18]), // cttr
                Long.parseLong(datas[19]), // selnCntgSmtn
                Long.parseLong(datas[20]), // shnuCntgSmtn
                datas[21], // ccldDvsn
                new BigDecimal(datas[22]), // shnuRate
                new BigDecimal(datas[23]), // prdyVolVrssAcmlVolRate
                datas[24], // oprcHour
                datas[25], // oprcVrssPrprSign
                Integer.parseInt(datas[26]), // oprcVrssPrpr
                datas[27], // hgprHour
                datas[28], // hgprVrssPrprSign
                Integer.parseInt(datas[29]), // hgprVrssPrpr
                datas[30], // lwprHour
                datas[31], // lwprVrssPrprSign
                Integer.parseInt(datas[32]), // lwprVrssPrpr
                datas[33], // bsopDate
                datas[34], // newMkopClsCode
                datas[35], // trhtYn
                Long.parseLong(datas[36]), // askpRsqn1
                Long.parseLong(datas[37]), // bidpRsqn1
                Long.parseLong(datas[38]), // totalAskpRsqn
                Long.parseLong(datas[39]), // totalBidpRsqn
                new BigDecimal(datas[40]), // volTnrt
                Long.parseLong(datas[41]), // prdySmnsHourAcmlVol
                new BigDecimal(datas[42]), // prdySmnsHourAcmlVolRate
                datas[43], // hourClsCode
                datas[44], // mrktTrtmClsCode
                Integer.parseInt(datas[45])  // viStndPrc
        );
    }
}
