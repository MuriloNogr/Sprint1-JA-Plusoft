package br.com.fiap.challenge.challengeja.service;

import br.com.fiap.challenge.challengeja.model.Empresa;
import br.com.fiap.challenge.challengeja.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Empresa> listarTodasEmpresas() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> encontrarEmpresaPorId(Long id) {
        return empresaRepository.findById(id);
    }

    public Empresa salvarEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public void deletarEmpresa(Long id) {
        empresaRepository.deleteById(id);
    }
}