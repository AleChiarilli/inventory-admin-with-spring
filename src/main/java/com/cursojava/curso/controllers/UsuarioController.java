package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable long id) {

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Ale");
        usuario.setApellido("Chiari");
        usuario.setEmail("alejandro@gmail.com");
        usuario.setTelefono("555555");
        usuario.setContrasena("123456");

        return usuario;
    }
}
