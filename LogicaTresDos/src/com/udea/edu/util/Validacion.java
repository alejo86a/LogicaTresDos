/**
 * 
 */
package com.udea.edu.util;

/**
 * @author alejandro
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by AleXx Duke on 18/12/2014.
 */
public class Validacion {
    private JTextField caja1, caja2;
    private JLabel jl_Texto1, jl_Texto2;
    
    public static String validar(KeyEvent e, String texto) {
        int codigo = (int) e.getKeyChar();
        char ultimo = ' ';
        boolean tieneIgual = false;
        int codigoUltimo;

        /* Con este condicional busco el último de la cadena de texto
         * para mirar si es un signo más (+) o un signo menos (-)
         */
        if (texto.length() > 0) {
            ultimo = texto.charAt(texto.length() - 1);
            int i = 1;
            while ((ultimo == ' ') && (i < texto.length())) {
                ultimo = texto.charAt(texto.length() - i);
                i = i + 1;
            }
        }

        // Este ciclo me permite saber si la expresión ya tiene un signo igual y así evitar ingresar otro
        for (int i = 0; i < texto.length(); i++) {
            if ((int) texto.charAt(i) == 61) {
                tieneIgual = true;
                break;
            } else
                tieneIgual = false;
        }

        codigoUltimo = (int) ultimo;

        /* Con este código se hacen las validaciones de los caracteres que son permitidos para ser ingresados
         * dentro de la aplicacion.
         */
        if (codigo == 88 || codigo == 89 || codigo == 90) {
            String aux = Character.toString(e.getKeyChar()).toLowerCase();
            e.setKeyChar(aux.charAt(0));
        } else if (codigo == 120 || codigo == 121 || codigo == 122)
            e.setKeyChar(e.getKeyChar());
        else if ((codigo > 47 && codigo < 58) || codigo == 32)
            e.setKeyChar(e.getKeyChar());
        else if (codigo == 61 && !tieneIgual && (codigoUltimo != 43 && codigoUltimo != 45))
            e.setKeyChar(e.getKeyChar());
        else if (codigo == 43 && codigoUltimo != 43 && codigoUltimo != 45)
            e.setKeyChar(e.getKeyChar());
        else if (codigo == 45 && codigoUltimo != 43 && codigoUltimo != 45)
            e.setKeyChar(e.getKeyChar());
        else
            e.consume();
        
        return texto;
    }
}
