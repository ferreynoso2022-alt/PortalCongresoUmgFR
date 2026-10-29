/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.congreso2026fr;

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fernando Rey
 */
public class Expositor {
    private int idExpositor;
    private String nombre;
    private String especialidad;

    public Expositor(int idExpositor, String nombre, String especialidad){
        setIdExpositor(idExpositor);
        setNombre(nombre);
        setEspecialidad(especialidad);
    }

    private static Expositor desdeCSV(String linea){
        String[] partes = linea.split(",");
        if (partes.length == 3) {
            int id = Integer.parseInt(partes[0].trim());
            String nombre = partes[1].trim();
            String especialidad = partes[2].trim();
            
            return new Expositor(id, nombre, especialidad);
        }
        
        return null;
    }
    

    public static ArrayList<Expositor> RetornarExpositores(){
        ArrayList<Expositor> listaExpositores = new ArrayList<>();
        String ruta = "temp/Expositores.txt";
        File archivo = new File(ruta);

        if (!archivo.exists()) {
            System.out.println("El archivo no existe, no hay datos por leer");
            return listaExpositores;
        }

        try (Scanner sc = new Scanner(archivo)){
            while (sc.hasNextLine()) {
                String linea = sc.nextLine().trim();
                if (linea.isEmpty()) {
                    continue;
                }

                Expositor exp = Expositor.desdeCSV(linea);

                if (exp != null) {
                    listaExpositores.add(exp);
                } else{
                    System.out.println("Ocurrio un error EXPOSITOR");
                }

            }

        } catch (IOException e) {
            System.out.println("Ocurrio un error EXPOSITOR2");

        }
        
        return listaExpositores;

    }

    @Override 
    public String toString(){
        return this.getNombre();
    }

    public int getIdExpositor(){
        return idExpositor;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEspecialidad(){
        return especialidad;
    }

    private void setIdExpositor(int idExpositor){
        this.idExpositor = idExpositor;
    }
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
    private void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    
}
