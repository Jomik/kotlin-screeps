@file:Suppress("unused")

package screeps

abstract external class Resource : RoomObject, Identifiable {
  val amount: Int
  val resourceType: ResourceConstant
}