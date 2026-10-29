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
public class Conferencia {
    private int idConferencia;
    private String titulo;
    private String salon;
    private String expositorAsignado;


    public Conferencia(int idConferencia, String titulo, String salon, String expositorAsignado){
        setIdConferencia(idConferencia);
        setTitulo(titulo);
        setExpositorAsignado(expositorAsignado);
        setSalon(salon);
    }

    private static Conferencia desdeCSV(String linea){
        String[] partes = linea.split(",");
        if (partes.length == 4) {
            int id = Integer.parseInt(partes[0].trim());
            String titulo = partes[1].trim();
            String salon = partes[2].trim();
            String expositor = partes[3].trim();
            
            return new Conferencia(id, titulo, salon, expositor);
        }
        
        return null;
    }

    public static ArrayList<Conferencia> RetornarConferencias(){
        ArrayList<Conferencia> listaConferencias = new ArrayList<>();
        String ruta = "temp/Conferencias.txt";
        File archivo = new File(ruta);

        if (!archivo.exists()) {
            System.out.println("El archivo no existe, no hay datos por leer");
            return listaConferencias;
        }
        
        try (Scanner sc = new Scanner(archivo)) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine().trim();
                if (linea.isEmpty()) {
                    continue;
                }

                Conferencia conf = desdeCSV(linea);

                if (conf != null) {
                    listaConferencias.add(conf);
                } else {
                    System.out.println("Ocurrio un problema");
                }
                
            }
            
        } catch (IOException e) {
            System.out.println("Ocurrio un error");
        }

        return listaConferencias;

    }

    public int getIdConferencia(){
        return idConferencia;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getExpositorAsignado(){
        return expositorAsignado;
    }
    public String getSalon(){
        return salon;
    }

    private void setIdConferencia(int idConferencia){
        this.idConferencia = idConferencia;
    }
    private void setTitulo(String titulo){
        this.titulo = titulo;
    }
    private void setExpositorAsignado(String expositorAsignado){
        this.expositorAsignado = expositorAsignado;
    }
    private void setSalon(String salon){
        this.salon = salon;
    }
}
