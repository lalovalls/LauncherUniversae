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

    private static final String JSON_FILE_PATH = "src/grados.json";

    public static String NombreGrado(int indexGrado) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))) {
            StringBuilder jsonData = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                jsonData.append(line);
            }

            // Convertir el JSON en un objeto JSONObject
            JSONObject jsonObject = new JSONObject(jsonData.toString());

            // Obtener el JSONArray de los grados
            JSONArray grados = jsonObject.getJSONArray("grados");

            // Verificar si el índice del grado está dentro del rango
            if (indexGrado >= 0 && indexGrado < grados.length()) {
                // Obtener el objeto JSONObject del grado en el índice especificado
                JSONObject grado = grados.getJSONObject(indexGrado);

                // Obtener el nombre del grado
                return grado.getString("nombres");
            } else {
                return "Índice de grado fuera de rango";
            }
        } catch (IOException | JSONException e) {
            return "Error al leer el archivo JSON";
        }
    }
}

