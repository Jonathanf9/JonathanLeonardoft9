/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaloteria90;

import java.util.Scanner;

/**
 *
 * @author jonathanfb
 */
public class EntradaLoteria90 {

    private int entradaInt;
    private String entradaStr;
    Scanner sc = new Scanner(System.in);
    Scanner scStr = new Scanner(System.in);

    public EntradaLoteria90() {
        entradaInt = 0;
        entradaStr = "";
    }

    public void setEntradaInt() {
        entradaInt = sc.nextInt();
    }

    public int getEntradaInt() {
        return entradaInt;
    }

    public void setEntradaStr() {
        entradaStr = scStr.nextLine();
    }

    public String getEntradaStr() {
        return entradaStr;
    }

}
