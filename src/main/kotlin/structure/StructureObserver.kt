package screeps.structure

import screeps.Owned
import screeps.ScreepsReturnCode

abstract external class StructureObserver : Structure, Owned {
  fun observeRoom(roomName: String): ScreepsReturnCode
}