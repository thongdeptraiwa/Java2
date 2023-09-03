/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author macos
 */
public class XDate {
    private static SimpleDateFormat sdf = new SimpleDateFormat();
    public static Date parse(String text, String pattern)
            throws RuntimeException{
        try{
            sdf.applyPattern(pattern);
            return sdf.parse(text);
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
    
    public static Date parse(String text)
            throws RuntimeException{
        return XDate.parse(text, "dd/mm/yyyy");
    }
}
