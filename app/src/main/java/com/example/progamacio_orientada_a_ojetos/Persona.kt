package com.example.progamacio_orientada_a_ojetos

class Persona(val nombre: String, var saldo: Double) {

    fun retirar(monto: Double) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto
            println("$nombre ha retirado $monto. Saldo restante: $saldo")
        } else {
            println("Error: Fondos insuficientes para retirar $monto")
        }
    }

    fun consignar(monto: Double) {
        if (monto > 0) {
            saldo += monto
            println("$nombre ha consignado $monto. Nuevo saldo: $saldo")
        } else {
            println("Error: El monto a consignar debe ser mayor que cero")
        }
    }
}
