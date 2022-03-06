package br.com.fiap

class OrderPending(
    val order: ShoppingOrder
) :ShoppingOrderState {
    var nome: String = "OrderPending"

    override fun approvePayment() {
       this.order.state = OrderApproved(this.order)
    }

    override fun rejectPayment() {
       this.order.state = OrderRejected(this.order)
    }

    override fun waitPayment() {
       println("O pedido ja está no estado pagamento pendente")
    }

    override fun shipOrder() {
        println("Não posso enviar pedido com o pagamento pendente")
    }

    override fun getName(): String {
        return this.nome
    }
}