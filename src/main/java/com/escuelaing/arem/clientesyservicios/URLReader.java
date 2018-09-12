/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuelaing.arem.clientesyservicios;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author 2103258
 */
public class URLReader {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese URL: ");
        String url = reader.next();
        Browser.createhtml(url);
        reader.close();
    }
}
