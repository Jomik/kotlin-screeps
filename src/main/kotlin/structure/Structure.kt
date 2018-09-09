package screeps.structure

import screeps.Identifiable
import screeps.RoomObject
import screeps.ScreepsReturnCode
import screeps.StructureConstant

abstract external class Structure : RoomObject, Identifiable {
  val hits: Int
  val hitsMax: Int
  val structureType: StructureConstant

  fun destroy(): ScreepsReturnCode
  fun isActive(): Boolean
  fun notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode
}
