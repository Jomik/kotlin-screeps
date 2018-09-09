package screeps.structure

import screeps.Decaying
import screeps.StoreDefinition

abstract external class StructureContainer : Structure, Decaying {
  val store: StoreDefinition
  val storeCapacity: Int
}