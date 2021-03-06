@file:Suppress("unused")

package screeps

abstract external class ConstructionSite : RoomObject, Owned, Identifiable {
  val progress: Int
  val progressTotal: Int
  val structureType: BuildableStructureConstant

  fun remove(): ScreepsReturnCode
}