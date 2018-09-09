package screeps.structure

import screeps.Decaying
import screeps.Owned
import screeps.ScreepsReturnCode

abstract external class StructureRampart : Structure, Owned, Decaying {
  val isPublic: Boolean
  fun setPublic(isPublic: Boolean): ScreepsReturnCode
}