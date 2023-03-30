package com.example.javadto.servicio;

import com.example.javadto.dto.UsuarioDTO;
import com.example.javadto.model.Usuario;
import com.example.javadto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO) {
        //El sistema va generar una contrasena;
        UUID contrasena = UUID.randomUUID();
        Usuario usuario =  new Usuario(usuarioDTO.getCedula(),
                usuarioDTO.getNombre(),
                usuarioDTO.getCorreo(),
                usuarioDTO.getAlias(),
                contrasena.toString(),
                "18",
                true,
                usuarioDTO.getApellido());
        this.usuarioRepository.save(usuario);
        return usuarioDTO;
    }

    public List<UsuarioDTO> obtenerUsuarios() {
        return this.usuarioRepository.findAll()
                .stream()
                .map(usuario -> new UsuarioDTO(
                        usuario.getNombre(),
                        usuario.getApellido(),
                        usuario.getAlias(),
                        usuario.getEmail(),
                        usuario.getCedula()))
                .collect(Collectors.toList());
    }
}
