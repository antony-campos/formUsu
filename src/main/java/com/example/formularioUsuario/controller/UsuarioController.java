/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.formularioUsuario.controller;

import com.example.formularioUsuario.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author LAB_P03
 */
@Controller
public class UsuarioController {

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardarProducto(Usuario usuario, Model model) {
        model.addAttribute("usuario", usuario);
        return "resultado";
    }
}
