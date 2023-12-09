package com.example.progamacio_orientada_a_ojetos

class Cajero {

    fun procesarRetiro(persona: Persona, monto: Double) {
        persona.retirar(monto)
    }

    fun procesarConsignacion(persona: Persona, monto: Double) {
        persona.consignar(monto)
    }
}
