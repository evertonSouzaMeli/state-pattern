package br.com.fiap

interface ShoppingOrderState {
    fun approvePayment()
    fun rejectPayment()
    fun waitPayment()
    fun shipOrder()
    fun getName() : String
}
