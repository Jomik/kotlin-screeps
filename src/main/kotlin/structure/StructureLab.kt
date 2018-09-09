package screeps.structure

import screeps.Creep
import screeps.EnergyContainer
import screeps.Owned
import screeps.ScreepsReturnCode

abstract external class StructureLab : Structure, Owned, EnergyContainer {
  val cooldown: Int
  val mineralAmount: Int
  val mineralType: String
  val mineralCapacity: Int
  fun boostCreep(creep: Creep, bodyPartsCount: Int = definedExternally): ScreepsReturnCode
  fun runReaction(lab1: StructureLab, lab2: StructureLab): ScreepsReturnCode
}