package io.cavia.mockinvest.mapper;

import io.cavia.mockinvest.domain.StockRealTime;

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
            datas[2],  // stckPrpr
            datas[3],  // prdyVrssSign
            datas[4],  // prdyVrss
            datas[5],  // prdyCtrt
            datas[6],  // wghnAvrgStckPrc
            datas[7],  // stckOprc
            datas[8],  // stckHgpr
            datas[9],  // stckLwpr
            datas[10], // askp1
            datas[11], // bidp1
            datas[12], // cntgVol
            datas[13], // acmlVol
            datas[14], // acmlTrPbmn
            datas[15], // selnCntgCsnu
            datas[16], // shnuCntgCsnu
            datas[17], // ntbyCntgCsnu
            datas[18], // cttr
            datas[19], // selnCntgSmtn
            datas[20], // shnuCntgSmtn
            datas[21], // ccldDvsn
            datas[22], // shnuRate
            datas[23], // prdyVolVrssAcmlVolRate
            datas[24], // oprcHour
            datas[25], // oprcVrssPrprSign
            datas[26], // oprcVrssPrpr
            datas[27], // hgprHour
            datas[28], // hgprVrssPrprSign
            datas[29], // hgprVrssPrpr
            datas[30], // lwprHour
            datas[31], // lwprVrssPrprSign
            datas[32], // lwprVrssPrpr
            datas[33], // bsopDate
            datas[34], // newMkopClsCode
            datas[35], // trhtYn
            datas[36], // askpRsqn1
            datas[37], // bidpRsqn1
            datas[38], // totalAskpRsqn
            datas[39], // totalBidpRsqn
            datas[40], // volTnrt
            datas[41], // prdySmnsHourAcmlVol
            datas[42], // prdySmnsHourAcmlVolRate
            datas[43], // hourClsCode
            datas[44], // mrktTrtmClsCode
            datas[45]  // viStndPrc
        );
    }
}
