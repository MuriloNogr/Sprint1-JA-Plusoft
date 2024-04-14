package br.com.fiap.challenge.challengeja.controller;

import br.com.fiap.challenge.challengeja.model.Empresa;
import br.com.fiap.challenge.challengeja.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String cadastrarEmpresaForm() {
        return "empresas/cadastrar_empresas";
    }

    @PostMapping("/cadastrar")
    public String cadastrarEmpresa(@RequestParam String nome, @RequestParam String descricao) {
        Empresa novaEmpresa = new Empresa();
        novaEmpresa.setNome(nome);
        novaEmpresa.setDescricao(descricao);
        empresaRepository.save(novaEmpresa); // Salva a nova empresa no banco de dados
        return "redirect:/empresas/listar";
    }
}
