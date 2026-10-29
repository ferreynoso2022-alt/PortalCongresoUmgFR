/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.congreso2026fr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fernando Rey
 */
public class Estudiante {
    
    private String carne;
    private String nombre;
    private String correo;
    private boolean asistio;

    public Estudiante(String carne, String nombre, String correo, boolean asistio){
        setCarne(carne);
        setNombre(nombre);
        setCorreo(correo);
        setAsistio(asistio);
    }

    public static Estudiante desdeCSV(String linea){
        String[] partes = linea.split(",");
        if (partes.length == 4) {
            String carne = partes[0].trim();
            String nombre = partes[1].trim();
            String correo = partes[2].trim();
            boolean asistio = Boolean.parseBoolean(partes[3].trim());
            
            return new Estudiante(carne, nombre, correo, asistio);
        }
        
        return null;
    }

    public static ArrayList<Estudiante> RetornarEstudiantes(){
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        String ruta = "temp/Estudiantes.txt";
        File archivo = new File(ruta);

        if (!archivo.exists()) {
            System.out.println("El archivo no existe, no hay datos por leer");
            return listaEstudiantes;
        }

        try (Scanner sc = new Scanner(archivo)){
            while (sc.hasNextLine()) {
                String linea = sc.nextLine().trim();
                if (linea.isEmpty()) {
                    continue;
                }

                Estudiante est = Estudiante.desdeCSV(linea);

                if (est != null) {
                    listaEstudiantes.add(est);
                } else{
                    System.out.println("Ocurrio un error ESTUDIANTE");
                }

            }

        } catch (IOException e) {
            System.out.println("Ocurrio un error ESTUDIANTE");

        }
        
        return listaEstudiantes;

    }

    public static void actualizarEstudiantes(ArrayList<Estudiante> listaEstudiantes){
        String ruta = "temp/Estudiantes.txt";

        try (FileWriter fw = new FileWriter(ruta)) {
            for (Estudiante est : listaEstudiantes) {
                String lineaCSV = est.getCarne()+","+est.getNombre()+","+est.getCorreo()+","+est.isAsistio();
                fw.append(lineaCSV+"\n");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al escribir el CSV");
        }

    }

    public String getCarne(){
        return carne;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public boolean isAsistio(){
        return asistio;
    }

    private void setCarne(String carne){
        this.carne = carne;
    }
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
    private void setCorreo(String correo){
        this.correo = correo;
    }
    private void setAsistio(boolean asistio){
        this.asistio = asistio;
    }

    public void setAsistencia(){
        this.asistio = true;
    }
        
}
