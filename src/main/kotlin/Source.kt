package screeps

abstract external class Source : RoomObject, Harvestable {
  val energy: Int
  val energyCapacity: Int
}