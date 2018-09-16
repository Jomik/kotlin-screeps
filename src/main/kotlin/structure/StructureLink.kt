package screeps.structure

import screeps.EnergyContainer
import screeps.Owned

abstract external class StructureLink : Structure, Owned, EnergyContainer {
  val cooldown: Int
  fun transferEnergy(target: StructureLink, amount: Int? = definedExternally)
}