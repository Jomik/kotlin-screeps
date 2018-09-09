package screeps

abstract external class Resource: RoomObject {
  val amount: Int
  val resourceType: ResourceConstant
}