package br.com.fiap

class ShoppingOrder {
    var state: ShoppingOrderState = OrderPending(this)
    set(state: ShoppingOrderState) {
        this.state = state
        println("O estado do pedido agora é ${this.getStateName()}")
    }

    fun getStateName() : String {
        return this.state!!.getName()
    }

    fun approvedPayment(){
        this.state!!.approvePayment()
    }

    fun rejetPayment(){
        this.state!!.rejectPayment()
    }

    fun waitPayment(){
        this.state!!.waitPayment()
    }

    fun shipOrder(){
        this.state!!.shipOrder()
    }
}