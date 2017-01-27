package sample;

import java.math.BigDecimal;

/**
 * Created by chapp on 25/01/2017.
 */
public class BigDecimalConverter {
    private BigDecimal converter;

    public BigDecimal bigDecimalConverter(String number){
        converter = new BigDecimal(number);
        return converter;
    }
}
