package screeps.structure

import screeps.EnergyContainer
import screeps.Owned
import screeps.ScreepsReturnCode

abstract external class StructurePowerSpawn : Structure, Owned, EnergyContainer {
  val power: Int
  val powerCapacity: Int
  fun createPowerCreep(name: String): ScreepsReturnCode
  fun processPower(): ScreepsReturnCode
}