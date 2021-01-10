package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden()
    {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
        System.out.println("Orden creada.");
    }
    
    public void agregarComputadora(Computadora computadora)
    {
        if(this.contadorComputadoras < MAX_COMPUTADORAS)
        {
            computadoras[contadorComputadoras++] = computadora;
            System.out.println("Computadora agregada.");
        }
        else
        {
            System.out.println("Limite de computadoras alcanzado.");
        }
    }
    
    public void mostrarOrden()
    {
        System.out.println("Imprimiendo orden:");
        System.out.println("ID Orden: " + this.idOrden);
        
        for(int i = 0; i < this.contadorComputadoras; i++)
        {
            System.out.println(this.computadoras[i]);
        }
    }
}

