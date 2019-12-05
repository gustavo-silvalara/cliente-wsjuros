package pagina;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JurosCompostoController {
    @GetMapping("/juroscomposto")
    public String greeting(@RequestParam(name = "capital", required = false, defaultValue = "") String capital,
                           @RequestParam(name = "juros", required = false, defaultValue = "") String juros,
                           @RequestParam(name = "periodo", required = false, defaultValue = "") String periodo,
                           Model model) {

        ParamUtils.validateMultipleParams(capital, juros, periodo);
        Float c = ParamUtils.parseFloat(capital);
        Float i = ParamUtils.parseFloat(ParamUtils.validateParam(juros));
        Integer t = ParamUtils.parseInt(ParamUtils.validateParam(periodo));
        String js;
        if (c != null && i != null & t != null) {
            Float result = WebServiceCaller.port.juroComposto(c,i,t);
            js = (result != null) ? String.valueOf(result).replace(".",",") : "";
        } else {
            js = "";
        }
        model.addAttribute("capital", capital);
        model.addAttribute("juros", juros);
        model.addAttribute("periodo", periodo);
        model.addAttribute("js", js);
        return "juroscomposto";
    }



}
