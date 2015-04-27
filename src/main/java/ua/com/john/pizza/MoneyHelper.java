/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 *
 * @author Иван Бородай
 */
public class MoneyHelper {
    public static String float2str(float number) {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
        otherSymbols.setDecimalSeparator('.');
        otherSymbols.setGroupingSeparator(','); 
        DecimalFormat df = new DecimalFormat("0.00", otherSymbols);
        return df.format(number);        
    }
    public static float str2float( String s ){
        if("".equals(s)) s="0.00";
        return Float.valueOf( s );
    }
}
