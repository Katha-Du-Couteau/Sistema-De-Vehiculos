/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadevehiculos;

/**
 *
 * @author yimid
 */
public class SistemaDeVehiculos {

    public static void main(String[] args) {
                Vehiculo v1 = new Vehiculo("Toyota", "Corolla", "A123456");
        Vehiculo v2 = new Vehiculo();
        Vehiculo v3 = new Vehiculo("B654321");

        System.out.println("--- solo km");
        v1.calcularMantenimiento(10000);

        System.out.println("--- km + basico");
        v2.calcularMantenimiento(10000, "basico");

        System.out.println("--- km + completo");
        v3.calcularMantenimiento(10000, "completo");

        System.out.println("--- servicio que no existe");
        v1.calcularMantenimiento(10000, "premium");

        System.out.println("--- mayusculas distintas");
        v1.calcularMantenimiento(10000, "BASICO");
    }
}
