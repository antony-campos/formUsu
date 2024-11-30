/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.formularioUsuario.controller;

import com.example.formularioUsuario.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author LAB_P03
 */
@Controller
public class ProductoController {

    @GetMapping("/formularioProducto")
    public String mostrarFormulario(Producto producto) {
        return "formulario";
    }

    @PostMapping("/guardarProducto")
    public String guardarProducto(Producto producto, Model model) {
        model.addAttribute("producto", producto);
        return "resultado";
    }
}
