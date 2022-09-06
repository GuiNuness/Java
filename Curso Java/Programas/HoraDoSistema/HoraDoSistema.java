package Programas.HoraDoSistema;

import java.util.*; 

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
        
        Locale lingua = Locale.getDefault();
        System.out.println("A linguagem do sistema é: ");
        System.out.println(lingua.toString());
    }
}
