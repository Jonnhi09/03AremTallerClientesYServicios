/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuelaing.arem.clientesyservicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Jonathan Prieto
 */
public class Browser {

    public static void createhtml(String url) throws MalformedURLException, IOException {
        File archivo = new File("./resultado.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        URL newUrl = new URL(url);
        try (BufferedReader reader
                = new BufferedReader(new InputStreamReader(newUrl.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                bw.write(inputLine);
            }
            bw.close();
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}
