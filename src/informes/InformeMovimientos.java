/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informes;

import java.util.ArrayList;
import movimientos.Movimiento;

/**
 * @author Carolina Barría
 */
public class InformeMovimientos {

    // agregar aquí las relaciones necesarias para emitir el informe según requerimientos
    private static ArrayList<Movimiento> guardamovimientos = new ArrayList<Movimiento>();

    public InformeMovimientos() {
    }

    public static void addMovimiento(Movimiento mvt) {
        guardamovimientos.add(mvt);
    }

    public static void listarMovimientos() {
        for (Movimiento mts : guardamovimientos) {
            System.out.println(mts.toString());
        }
    }

    public static ArrayList<Movimiento> getGuardamovimientos() {
        return guardamovimientos;
    }

    public static void setGuardamovimientos(ArrayList<Movimiento> guardamovimientos) {
        InformeMovimientos.guardamovimientos = guardamovimientos;
    }

}
