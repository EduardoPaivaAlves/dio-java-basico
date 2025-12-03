package org.example;

import java.util.SplittableRandom;

public class InverterPalavras {

    public String inverterPalavras (String frase){
        String regex;
        String[] palavras = frase.split(regex: " ");

        for(int i= 0; i < palavras.length; i++);{
            if(palavras[i].length() >= 5){
                palavras[i] = new StringBuilder(palavras[i]).reverse().toString();
            }
        }

        return String.join(delimiter:" " , palavras);   
    }
}
