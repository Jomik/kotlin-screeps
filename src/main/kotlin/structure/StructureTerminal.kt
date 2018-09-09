package screeps.structure

import screeps.Owned
import screeps.ResourceConstant
import screeps.ScreepsReturnCode
import screeps.StoreDefinition

abstract external class StructureTerminal : Structure, Owned {
  val cooldown: Int
  val store: StoreDefinition
  val storeCapacity: Int
  fun send(
    resourceType: ResourceConstant,
    amount: Int,
    destination: String,
    description: String = definedExternally
  ): ScreepsReturnCode
}