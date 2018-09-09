package screeps

abstract external class Tombstone : RoomObject, Decaying {
  val creep: Creep
  val deathTime: Int
  val store: StoreDefinition
}