package id.ac.ub.filkom.contoh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import id.ac.ub.filkom.contoh.entity.Anggota;
import id.ac.ub.filkom.contoh.service.AnggotaService;

@Controller
public class AnggotaController {

    @Autowired
    private AnggotaService anggotaService;

    @GetMapping("/anggota")
    public String tampilkanAnggota(Model model) {
        model.addAttribute("listAnggota", anggotaService.getAllAnggota());
        model.addAttribute("anggotaBaru", new Anggota());
        return "anggota";
    }

    @PostMapping("/anggota/simpan")
    public String simpanAnggota(@ModelAttribute Anggota anggota) {
        anggotaService.saveAnggota(anggota);
        return "redirect:/anggota";
    }
}