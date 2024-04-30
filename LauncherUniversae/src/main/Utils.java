/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author L4rry
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utils {

private static final String JSON_FILE_PATH = "src/main/grados.json";

    public static String NombreGrado(int indexGrado) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))) {
            StringBuilder jsonData = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                jsonData.append(line);
            }

            JSONObject grados = new JSONObject (jsonData.toString())
                    .getJSONArray("grados")
                    .getJSONObject(indexGrado);
            
            return grados.getString("nombres");


        } catch (IOException | JSONException e) {
            return "Error al leer el archivo JSON";
        }
    }
    public static String TituloJuegos(int indexGrado, int indexJuegos) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))) {
            StringBuilder jsonData = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                jsonData.append(line);
            }

            JSONObject grados = new JSONObject(jsonData.toString())
                    .getJSONArray("grados")
                    .getJSONObject(indexGrado)
                    .getJSONArray("juegos")
                    .getJSONObject(indexJuegos);

            return grados.getString("titulo");

        } catch (IOException | JSONException e) {
            return "Error al leer el archivo JSON";
        }
    }
   
}

