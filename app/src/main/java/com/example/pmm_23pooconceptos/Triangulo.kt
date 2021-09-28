package com.example.pmm_23pooconceptos

class Triangulo() {

    var lado0:Double = 0.0
    var lado1: Double =  0.0
    var lado2: Double = 0.0

    constructor(lado0:Double, lado1: Double,lado2: Double): this() {
        this.lado0 = lado0
        this.lado1 = lado1
        this.lado2 = lado2
    }

    //Atributos


    //Métodos
    fun ladoMayor():Double{
        if (this.lado0 > this.lado1 && this.lado0 > this.lado2)
            return this.lado0
        else if(this.lado1 > this.lado2)
            return this.lado1
        else
            return this.lado2
    }

    fun esEquilatero():Boolean{
        return lado0 == lado1 && lado1 == lado2
    }

}