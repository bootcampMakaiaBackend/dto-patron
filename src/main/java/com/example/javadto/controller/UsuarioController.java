package com.example.javadto.controller;

import com.example.javadto.dto.UsuarioDTO;
import com.example.javadto.model.Usuario;
import com.example.javadto.servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/v1")
public class UsuarioController {

    UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/usuario")
    public UsuarioDTO crearUsuario(@RequestBody UsuarioDTO usuarioDTO){
        return this.usuarioService.crearUsuario(usuarioDTO);
    }

    @GetMapping("/usuarios")
    public List<UsuarioDTO>  obtenerUsuarios(){
        return this.usuarioService.obtenerUsuarios();
    }
}
