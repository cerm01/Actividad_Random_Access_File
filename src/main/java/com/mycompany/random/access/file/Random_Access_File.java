
package com.mycompany.random.access.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;



public class Random_Access_File {

    RandomAccessFile raf = null;
    File file;
    String path = "C:\\Users\\CARLO\\Desktop\\SEMESTRE 9\\SEMINARIO DE SOLUCION DE PROBLEMAS DE ESTRUCTURAS DE DATOS II\\Random-Access-File\\src\\main\\java\\com\\mycompany\\random\\access\\file\\archivo.obj";
    
    public Random_Access_File(){
        try {
            file = new File(path);
            raf = new RandomAccessFile(file, "rw");
        } catch (FileNotFoundException ex) {

        }
    }

    public void CreateFile() throws Exception{
        try {
            File archivo = new File(path);
    
            if (!archivo.exists()) {
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null, "El archivo se ha creado exitosamente");
            } else{
                JOptionPane.showMessageDialog(null, "El archivo ya existe");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo");
        }
    }
    
    public void AddBeginning(double number) throws Exception{
        try (RandomAccessFile raf = new RandomAccessFile(path, "rw")) {
            long fileLength = raf.length();
            byte[] bytes = new byte[(int) fileLength];
            raf.readFully(bytes);
            
            raf.seek(0);
            raf.writeDouble(number);
            raf.write(bytes);
        } catch (IOException e) {
            // Maneja la excepción apropiadamente, por ejemplo, registrándola o lanzándola nuevamente.
            e.printStackTrace();
        }
    }

    public void AddEnd(double number) throws Exception{
        try (RandomAccessFile raf = new RandomAccessFile(path, "rw")) {
            raf.seek(raf.length()); // Colócate al final del archivo
            raf.writeDouble(number);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void ReadFile() throws Exception{
        if (raf != null){
            raf.close();
        }
    }

    public String Print() throws IOException {
        raf.seek(0);
        StringBuilder contenido = new StringBuilder();
        try {
            while (raf.getFilePointer() < raf.length()) {
                double numero = raf.readDouble();
                contenido.append(numero).append("\n");
            }
        } catch (IOException e) {
            // Manejar excepción de EOF (fin de archivo)
        }
        return contenido.toString();
    }
    
    public long Buscar(double valor) throws IOException {
        raf.seek(0);
        long posicion = -1; // Inicialmente, asumimos que no se encontró el valor
        try {
            while (raf.getFilePointer() < raf.length()) {
                long actualPosicion = raf.getFilePointer();
                double numero = raf.readDouble();
                if (numero == valor) {
                    // Si encontramos el valor, almacenamos la posición y salimos del bucle
                    posicion = actualPosicion;
                    break;
                }
            }
        } catch (IOException e) {
            // Manejar excepción de EOF (fin de archivo)
        }
        return posicion;
    }

    public boolean Eliminar(long posicion) throws IOException {
        if (posicion < 0 || posicion >= raf.length()) {
            // La posición está fuera de los límites del archivo
            return false;
        }
    
        long nuevaPosicion = posicion + 8; // Avanzamos 8 bytes para apuntar al valor siguiente
        raf.seek(nuevaPosicion); // Nos colocamos en la posición del valor siguiente
        long longitudRestante = raf.length() - nuevaPosicion; // Calculamos la longitud restante del archivo
        byte[] buffer = new byte[1024]; // Creamos un buffer de 1KB
        int bytesRead; // Variable para almacenar el número de bytes leídos en cada iteración
    
        while (longitudRestante > 0) { // Mientras queden bytes por leer
            bytesRead = raf.read(buffer, 0, (int) Math.min(buffer.length, longitudRestante)); // Leemos el buffer
            raf.seek(raf.getFilePointer() - bytesRead - 8); // Retrocedemos para sobrescribir el valor
            raf.write(buffer, 0, bytesRead); // Sobrescribimos el valor
            nuevaPosicion += bytesRead; // Actualizamos la nueva posición
            longitudRestante -= bytesRead; // Actualizamos la longitud restante
        }
    
        raf.setLength(raf.length() - 8); // Restamos 8 bytes para eliminar un valor double
        return true; // Devolvemos true para indicar que se eliminó el valor
    }

    public boolean Editar(long posicion, double valor) throws IOException{
        if (posicion < 0 || posicion >= raf.length()) {
            // La posición está fuera de los límites del archivo
            return false;
        }
    
        raf.seek(posicion);
        raf.writeDouble(valor);
        return true;
    }
    

}
