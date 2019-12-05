package pagina;

import java.util.Arrays;
import java.util.List;

public class ParamUtils {

    public static String validateParam(String param){
        return (param != null && !param.isEmpty()) ? param : "";
    }

    public static Float parseFloat(String param){
        Float r = null;
        try {
            r = Float.parseFloat(param);
        } catch (NumberFormatException ex){
            r = null;
        }
        return r;
    }

    public static Integer parseInt(String param){
        Integer r = null;
        try {
            r = Integer.parseInt(param);
        } catch (NumberFormatException ex){
            r = null;
        }
        return r;
    }

    public static void validateMultipleParams(String... params) {
        List<String> paramList = Arrays.asList(params);
        for (String p : paramList) {
            p = validateParam(p);
        }
    }

}
