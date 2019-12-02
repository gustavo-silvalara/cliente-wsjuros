package pagina;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import wsjuros.JurosWS;
import wsjuros.JurosWS_Service;

@Controller
public class GreetingController {
    @GetMapping("/jurossimples")
    public String greeting(@RequestParam(name = "capital",required=false, defaultValue = "")  String capital,
                           @RequestParam(name = "juros",required=false, defaultValue = "")  String juros,
                           @RequestParam(name = "periodo",required=false, defaultValue = "")  String periodo,
                           @RequestParam(name = "js",required=false, defaultValue = "")  String js,
                           Model model) {
        model.addAttribute("capital", capital);
        model.addAttribute("juros", juros);
        model.addAttribute("periodo", periodo);
//
//        float c = Float.valueOf(capital);
//        float i = Float.valueOf(juros);
//        int t = Integer.parseInt(periodo);
//        JurosWS_Service service = new JugrosWS_Service();
//        JurosWS port = service.getJurosWSPort();
//        float resultado = port.juroSimples(c,i,t);
//        model.addAttribute("js", String.valueOf(resultado));
        return "jurossimples";
    }
}
