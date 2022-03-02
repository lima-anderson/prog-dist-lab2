package com.example.app;

import model.Usuario;
import org.springframework.web.bind.annotation.*;
import service.UsuariosService;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    private UsuariosService usuariosService;


    @GetMapping
    public List<Usuario> getUsuarios(){
        return usuariosService.getUsuarios();
    }

    @GetMapping("/{codigo}")
    public Usuario getUsuarioPorCodigo(@PathVariable int codigo){
        return this.usuariosService.getUsuarioPorCodigo(codigo);
    }

    @PostMapping(path = "", consumes = "application/json", produces = "application/json")
    public Integer inserirUsuario(@RequestBody Usuario usuario) {
        this.usuariosService.inserirUsuario(usuario);
        return usuario.getCodigo();
    }


}
