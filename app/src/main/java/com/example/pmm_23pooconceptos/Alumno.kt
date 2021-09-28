package com.example.pmm_23pooconceptos

class Alumno() {
    //Atributos
    var nombre = ""
    var nota = 0.0
    //Constructor
    constructor(nombre:String, nota:Double): this(){
        this.nombre = nombre
        this.nota = nota
    }
    //Métodos
    fun getDetails():String{
        return "Nombre: ${this.nombre}, Nota: ${this.nota}"
    }

    fun mostrarEstado():String{
        if (this.nota >= 5)
            return "Aprobado"
        else
            return "Suspendido"
    }

    override fun toString(): String {
        return "Alumno: '$nombre', nota: $nota"
    }


}