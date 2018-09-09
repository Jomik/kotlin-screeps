package screeps.structure

import screeps.Creep
import screeps.EnergyContainer
import screeps.Owned
import screeps.ScreepsReturnCode

abstract external class StructureTower : Structure, Owned, EnergyContainer {
  fun attack(target: Creep): ScreepsReturnCode
  fun heal(target: Creep): ScreepsReturnCode
  fun repair(target: Structure): ScreepsReturnCode

}