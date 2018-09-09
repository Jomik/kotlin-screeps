package screeps.structure

import screeps.Owned
import screeps.StoreDefinition

abstract external class StructureStorage : Structure, Owned {
  val store: StoreDefinition
  val storeCapacity: Int
}