package br.com.fiap

class OrderRejected(
    val order: ShoppingOrder
) : ShoppingOrderState {
    var nome: String = "OrderRejected"

    override fun approvePayment() {
        println("Não posso aprovar o pagamento, porque o pagamento foi recusado")
    }

    override fun rejectPayment() {
        println("Não posso recusar o pagamento, porque o pagamento foi recusado")
    }

    override fun waitPayment() {
        println("Não posso aguardar o pagamento, porque o pagamento foi recusado")
    }

    override fun shipOrder() {
        println("Não posso enviar pedido, porque o pedido foi recusado")
    }

    override fun getName(): String {
        return this.nome
    }
}