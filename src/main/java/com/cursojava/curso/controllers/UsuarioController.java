package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario1 = new Usuario();
        usuario1.setId(123L);
        usuario1.setNombre("Ale");
        usuario1.setApellido("Chiari");
        usuario1.setEmail("alejandro@gmail.com");
        usuario1.setTelefono("555555");
        usuario1.setContrasena("123456");

        Usuario usuario2 = new Usuario();
        usuario2.setId(456L);
        usuario2.setNombre("Maria");
        usuario2.setApellido("Gonzalez");
        usuario2.setEmail("Maria@gmail.com");
        usuario2.setTelefono("555555");
        usuario2.setContrasena("123456");

        Usuario usuario3 = new Usuario();
        usuario3.setId(789L);
        usuario3.setNombre("Carlos");
        usuario3.setApellido("Amaya");
        usuario3.setEmail("Carlos@gmail.com");
        usuario3.setTelefono("555555");
        usuario3.setContrasena("123456");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

}
