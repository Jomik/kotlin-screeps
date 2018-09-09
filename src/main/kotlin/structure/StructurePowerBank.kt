package screeps.structure

import screeps.Decaying

abstract external class StructurePowerBank : Structure, Decaying {
  val power: Int
}