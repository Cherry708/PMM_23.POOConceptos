package com.example.pmm_23pooconceptos

import android.app.Person

class Persona() {
    //Atributos
    var nombre:String = ""
    var edad: Int? = null

    //Constructores
    constructor(nombre:String, edad:Int) : this() {
        this.nombre = nombre
        this.edad = edad
    }

    //Métodos
    fun getDetails():String{
        return "${this.nombre}, ${this.edad}"
    }

    fun isOverAge(): Boolean{
        return this.edad!! >= 18
    }
}