package com.example.progamacio_orientada_a_ojetos

fun main() {
    val persona1 = Persona("Kevin", 20000.0)
    val cajero = Cajero()

    cajero.procesarRetiro(persona1, 1000.0)
    cajero.procesarConsignacion(persona1, 500.0)
}
