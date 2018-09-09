package screeps.structure

import screeps.Owned

abstract external class StructureExtractor : Structure, Owned {
  val cooldown: Int
}