package screeps

abstract external class ConstructionSite : RoomObject, Owned{
  val progress: Int
  val progressTotal: Int
  val structureType: BuildableStructureConstant

  fun remove(): ScreepsReturnCode
}