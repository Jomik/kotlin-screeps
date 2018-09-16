@file:Suppress("unused")

package screeps

external interface Market {
  val credits: Double
  val incomingTransactions: Array<Transaction>
  val orders: Record<String, Order>
  val outgoingTransactions: Array<Transaction>

  fun calcTransactionCost(amount: Int, roomName1: String, roomName2: String): Int
  fun cancelOrder(orderId: String): ScreepsReturnCode
  fun changeOrderPrice(orderId: String, newPrice: Double): ScreepsReturnCode
  fun createOrder(
    type: String,
    resourceType: MarketResourceConstant,
    price: Double,
    totalAmount: Int,
    roomName: String? = definedExternally
  ): ScreepsReturnCode

  fun deal(orderId: String, amount: Int, targetRoomName: String? = definedExternally): ScreepsReturnCode
  fun extendOrder(orderId: String, addAmount: Int): ScreepsReturnCode
  fun getAllOrders(filter: Order.Filter? = definedExternally): Array<Order>
  fun getAllOrders(filter: ((o: Order) -> Boolean)? = definedExternally): Array<Order>
  fun getAllOrders(): Array<Order>
  fun getOrderById(id: String): Order?

  interface Order {
    val id: String
    val created: Int
    val active: Boolean
    val type: OrderConstant
    val resourceType: MarketResourceConstant
    val roomName: String
    val amount: Int
    val remainingAmount: Int
    val totalAmount: Int
    val price: Double

    interface Filter {
      val id: String?
      val created: Int?
      val type: OrderConstant?
      val resourceType: MarketResourceConstant
      val roomName: String?
      val amount: Int?
      val remainingAmount: Int?
      val price: Double?
    }
  }

  interface Transaction {
    val transactionId: String
    val time: Int
    val sender: Owned.Owner
    val recipient: Owned.Owner
    val resourceType: MarketResourceConstant
    val amount: Int
    val from: String
    val to: String
    val description: String
    val order: Order?

    interface Order {
      val id: String
      val type: OrderConstant
      val price: Double
    }
  }
}