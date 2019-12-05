package pagina;

import ws.WSJuros;
import ws.WSJuros_Service;

public class WebServiceCaller {
    public static WSJuros_Service service = new WSJuros_Service();
    public static WSJuros port = service.getWSJurosPort();
}
