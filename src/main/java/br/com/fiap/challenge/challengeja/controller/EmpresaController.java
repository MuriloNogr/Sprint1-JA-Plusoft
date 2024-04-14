package br.com.fiap.challenge.challengeja.controller;

import br.com.fiap.challenge.challengeja.controller.dto.EmpresaDTO;
import br.com.fiap.challenge.challengeja.model.Empresa;
import br.com.fiap.challenge.challengeja.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping("/listar")
    public String listarEmpresas(Model model) {
        List<Empresa> empresas = empresaRepository.findAll();
        model.addAttribute("empresas", empresas);
        return "empresas/listar_empresas";
    }

    @GetMapping("/cadastrar")
    public String cadastrarEmpresaForm(Model model) {
        model.addAttribute("empresaDTO", new EmpresaDTO());
        return "empresas/cadastrar_empresas";
    }

    @PostMapping("/cadastrar")
    public String cadastrarEmpresa(@Valid @ModelAttribute EmpresaDTO empresaDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "empresas/cadastrar_empresas";
        }

        Empresa novaEmpresa = new Empresa();
        novaEmpresa.setNome(empresaDTO.getNome());
        novaEmpresa.setDescricao(empresaDTO.getDescricao());
        empresaRepository.save(novaEmpresa);
        return "redirect:/empresas/listar";
    }

}
