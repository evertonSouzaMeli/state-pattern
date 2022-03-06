package br.com.fiap

class OrderApproved(
    var order: ShoppingOrder
) :ShoppingOrderState {
    var nome: String = "OrderApproved"

    override fun approvePayment() {
        println("O pedido ja está no estado pagamento aprovado")
    }

    override fun rejectPayment() {
        this.order.state = OrderRejected(this.order)
    }

    override fun waitPayment() {
       this.order.state = OrderPending(this.order)
    }

    override fun shipOrder() {
        print("Enviando pedido pro cliente")
    }

    override fun getName(): String {
        return this.nome
    }
}