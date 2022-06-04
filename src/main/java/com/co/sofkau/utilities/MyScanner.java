package com.co.sofkau.utilities;

import com.co.sofkau.utilities.abstracts.MyScannerAbstract;

/**
 * Clase que implementa la clase Abstracta
 * sobreescribe los metodoso indicados y permite
 * caputrar la información ingresada por el usuario.
 *
 * @author JD-Amaya PA-Velasquez
 * @version 01.02.003 03/06/2022
 * @since 01.
 */
public class MyScanner extends MyScannerAbstract {

    public static MyScanner getInstance() {
        return new MyScanner();
    }

    /**
     * Permite caputrar un dato entero ingresado por el usuario
     *
     * @return el valor ingresado type Intger
     */
    @Override
    public Integer getInteger() {
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new MyException(exception.getMessage(), exception);
        }
    }

    /**
     * Permite caputrar un dato double ingresado por el usuario
     *
     * @return el valor ingresado type Double
     */
    @Override
    public Double getDouble() {
        try {
            return super.getDouble();
        } catch (Exception exception) {
            throw new MyException(exception.getMessage(), exception);
        }
    }

    /**
     * Permite caputrar un dato String ingresado por el usuario
     *
     * @return el valor ingresado type String
     */
    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new MyException(exception.getMessage(), exception);
        }
    }

}
