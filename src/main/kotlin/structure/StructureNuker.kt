package screeps.structure

import screeps.EnergyContainer
import screeps.RoomPosition
import screeps.ScreepsReturnCode

abstract external class StructureNuker : Structure, EnergyContainer {
  val ghodium: Int
  val ghodiumCapacity: Int
  val cooldown: Int
  fun launchNuke(pos: RoomPosition): ScreepsReturnCode
}