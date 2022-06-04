package com.co.sofkau.utilities.abstracts;
import java.util.Scanner;

/**
 * Clase abstracta que implementa los metodos
 * necesarios para caputrar la información sumistrada
 * por el usuario
 *
 * @author JD-Amaya PA-Velasquez
 * @version 01.02.003 03/06/2022
 * @since 01.
 */
public abstract class MyScannerAbstract {
    protected static final Scanner scanner = new Scanner(System.in);

    /**
     * Caputra un dato entero ingresado por el
     * usuario
     *
     * @return valor entero ingresado por el usuario
     */
    public Integer getInteger() {
        return Integer.parseInt(scanner.nextLine());
    }

    public Double getDouble() {
        return Double.parseDouble(scanner.nextLine());
    }

    public abstract String getString();

}
