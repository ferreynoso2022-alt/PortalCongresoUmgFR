/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.congreso2026fr;

import java.util.ArrayList;

/**
 *
 * @author Fernando Rey
 */
public class Pruebas {
    

    public static void main(String[] args) {

        Estudiante carlitos = new Estudiante(
            "3190-26-9633",
            "Fernando Reynoso",
            "fernandorey26@umg.edu.gt",
             false
        );

        System.out.println(carlitos.getCarne());
        System.out.println(carlitos.getNombre());
        System.out.println(carlitos.getCorreo());
        System.out.println(carlitos.isAsistio());

        System.out.println("------------ESTUDIANTE------------");

        System.out.println(carlitos.getCarne());
        System.out.println(carlitos.getNombre());
        System.out.println(carlitos.getCorreo());

        Expositor roberto = new Expositor(
            21, 
            "Roberto Juarez", 
            "Ciberseguridad"
        );

        System.out.println("------------EXPOSITOR------------");


        System.out.println(roberto.getIdExpositor());
        System.out.println(roberto.getNombre());
        System.out.println(roberto.getEspecialidad());

        Conferencia nuevasIdeas = new Conferencia(
            5, 
            "Un Vistaso a la Seguridad", 
            "Roberto Juarez", 
            "Salon Pinula"
        );

        System.out.println("------------CONFERENCIA------------");


        System.out.println(nuevasIdeas.getIdConferencia());
        System.out.println(nuevasIdeas.getTitulo());
        System.out.println(nuevasIdeas.getExpositorAsignado());
        System.out.println(nuevasIdeas.getSalon());

        System.out.println("------------Consultando ArrayList Expositores------------");

        ArrayList<Expositor> listaExpositores = Expositor.RetornarExpositores();

        for (int i = 0; i < listaExpositores.size(); i++) {
            System.out.println(listaExpositores.get(i).getNombre());
        }

    }
}
