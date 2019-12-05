package pagina;

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

}
