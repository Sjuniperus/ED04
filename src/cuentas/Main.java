/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentas;

/**
 *
 * @author sabi
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        operativa_cuenta();
        
    }

    private static void operativa_cuenta (){
     
         CCuenta cuenta1;
        double saldoActual;
        


        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789", 2500 ,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(687);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
