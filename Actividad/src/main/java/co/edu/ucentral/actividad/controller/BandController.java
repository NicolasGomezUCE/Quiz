package co.edu.ucentral.actividad.controller;


import co.edu.ucentral.actividad.dto.Band;
import co.edu.ucentral.actividad.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class BandController {

    @Autowired
    BandService bandService;


    @GetMapping("/band/new")
    public String mostrarFormulario(Model model){
        Band band = new Band();
        model.addAttribute("band", band);
        return "newBand";
    }


    @PostMapping("/band/new")
    public String registerCredit(@ModelAttribute("band") Band band) {
        bandService.createBand(band);
        return "redirect:/band";
    }

    @GetMapping("/band")
    public String getBands(Model model){
        model.addAttribute("bands", bandService.getAllBands());
        return "bands";
    }




}
