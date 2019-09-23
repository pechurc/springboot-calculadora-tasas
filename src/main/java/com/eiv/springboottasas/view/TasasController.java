package com.eiv.springboottasas.view;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.eiv.springboottasas.conversor.enums.Modulo;
import com.eiv.springboottasas.conversor.enums.TipoTasa;
import com.eiv.springboottasas.conversor.razon.Razon;
import com.eiv.springboottasas.conversor.razon.RazonFactory;
import com.eiv.springboottasas.conversor.tasa.Tasa;
import com.eiv.springboottasas.conversor.tasa.TasaFactory;
import com.eiv.springboottasas.dto.TasaDto;


@Controller
public class TasasController {
	
	@ModelAttribute("tipoTasas")
	public List<TipoTasa> populateTipoTasas() {
	    return Arrays.asList(TipoTasa.values());
	}
	
	@ModelAttribute("modulos")
	public List<Modulo> populateModulos() {
	    return Arrays.asList(Modulo.values());
	}
	
	@GetMapping("/")
	public String tasas(TasaDto tasaDto) {
		return "tasas";		
	}
	
	@PostMapping("/")
	public String calcularTasa(@Valid TasaDto tasaDto, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			return "tasas";
		}

		Razon razon = RazonFactory.getRazon(tasaDto.getTipoTasaOrigen());
		razon.setModuloOrigen(tasaDto.getModuloOrigen());
        razon.setModuloDestino(tasaDto.getModuloDestino());               
        razon.setDiasAmortizacion(tasaDto.getDiasAmortizacion());
        razon.setTasaOrigen(tasaDto.getValorTasa());
        
        Tasa tasa = TasaFactory.getTasa(tasaDto.getTipoTasaDestino());
		Double resultado = tasa.calcular(razon, tasaDto.getModuloDestino(), tasaDto.getDiasAmortizacion());
		model.addAttribute("resultado", String.format("%.2f", resultado));
		return "tasas";
	}
}
