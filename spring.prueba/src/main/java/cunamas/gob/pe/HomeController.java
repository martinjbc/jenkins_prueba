package cunamas.gob.pe;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cunamas.gob.pe.Service.OperacionesService;
import cunamas.gob.pe.dto.OperacionesDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired	
	OperacionesService operacionesService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		OperacionesDto dto=new OperacionesDto();
		dto.setN1(2);
		dto.setN2(3);
		dto.setOperacion("+");
		
		int resultado=operacionesService.resultado(dto);
		String mensaje="Se realizó la siguiente operación Subida: "+dto.getN1()+dto.getOperacion()+dto.getN2()+"="+resultado;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("mensaje", mensaje );
		
		return "home";
	}
	
}
