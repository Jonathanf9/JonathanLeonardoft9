/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaloteria90;

/**
 *
 * @author jonathanfb
 */
public class Main {

    public static void main(String[] args) {

        EntradaLoteria90 entrada = new EntradaLoteria90();
        DatosUnicos cg = new DatosUnicos();
        DatosUnicos numElegidos = new DatosUnicos();
        String continuar;

        cg.llenarDatosAle();
        cg.ordenar();
        do {
            int acertados = 0;

            numElegidos.llenarDatos();
            numElegidos.ordenar();
            System.out.println("Numeros elegidos " + numElegidos.mostrarDatos());
            System.out.println(" Numero ganador " + cg.mostrarDatos());

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (cg.getVectorElemento(i) == numElegidos.getVectorElemento(j)) {
                        acertados++;
                    }
                }

            }
            if (acertados != 0) {
                System.out.println("¡Felicidades, has ganado: " + acertados + " nùmeros!");
            } else {
                System.out.println("¡ Ha Perdido ");
            }
            System.out.println("Quieres probar otra vez?(S/N): ");
            entrada.setEntradaStr();
            continuar = entrada.getEntradaStr();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Fin del programa");
    }

}
