package screeps.structure

import screeps.Owned

abstract external class StructureKeeperLair : Structure, Owned {
  val ticksToSpawn: Int
}