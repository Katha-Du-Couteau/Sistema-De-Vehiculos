/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadevehiculos;

/**
 *
 * @author yimid
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    
    public Vehiculo(String marca, String modelo, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
    public Vehiculo(){
        this.marca = "sin marca";
        this.modelo = "sin modelo";
        this.placa = "Desconocido";
    }
        public Vehiculo(String placa){
        
        this.placa = placa;
        this.marca = "sin marca";
        this.modelo = "sin modelo";
    }
        public double calcularMantenimiento(int km){
            int tarifa = 5;
            double resultado = km * tarifa;
            System.out.println("el mantenimiento de todo vale:" + resultado);
            return resultado;
        }
        public double calcularMantenimiento(int km,String tipoServicio){
            double resultado = 0;
            
            if(tipoServicio.equalsIgnoreCase("basico")){
                int tarifa = 10;
                resultado = km * tarifa;
                System.out.println("mantenimiento basico: " + resultado);
            }else if(tipoServicio.equalsIgnoreCase("completo")){
                int tarifa = 20;
                resultado = km * tarifa;
                System.out.println("mantenimiento completo: " + resultado);
            }else{
                System.out.println("error al ingresar tipo de servicio");
            }
            return resultado;
        }
}
