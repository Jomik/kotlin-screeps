@file:Suppress("unused")

package screeps

import screeps.structure.Structure
import screeps.structure.StructureController

abstract external class Creep : HasPos, Owned, Identifiable, Named {
  val carry: StoreDefinition
  val carryCapacity: Int
  val body: Array<BodyPartConstant>
  val fatigue: Int
  val hits: Int
  val hitsMax: Int
  val memory: CreepMemory
  val room: Room
  val spawning: Boolean
  val saying: String
  val ticksToLive: Int?

  fun attack(target: Creep): ScreepsReturnCode
  fun attack(target: Structure): ScreepsReturnCode
  fun attackController(target: StructureController): ScreepsReturnCode
  fun build(target: ConstructionSite): ScreepsReturnCode
  fun cancelOrder(methodName: String): ScreepsReturnCode
  fun claimController(target: StructureController): ScreepsReturnCode
  fun dismantle(target: Structure): ScreepsReturnCode
  fun drop(resourceType: ResourceConstant, amount: Int? = definedExternally): ScreepsReturnCode
  fun generateSafeMode(target: StructureController): ScreepsReturnCode
  fun getActiveBodyparts(type: BodyPartConstant): Int
  fun harvest(target: Harvestable): ScreepsReturnCode
  fun heal(target: Creep): ScreepsReturnCode
  fun move(direction: DirectionConstant): ScreepsReturnCode
  fun moveByPath(path: Array<PathStep>): ScreepsReturnCode
  fun moveByPath(path: Array<RoomPosition>): ScreepsReturnCode
  fun moveByPath(serializedPath: String): ScreepsReturnCode
  fun moveTo(x: Int, y: Int, opts: MoveToOptions? = definedExternally): ScreepsReturnCode
  fun moveTo(target: NavigationTarget, opts: MoveToOptions? = definedExternally): ScreepsReturnCode
  fun notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode
  fun pickup(target: Resource): ScreepsReturnCode
  fun rangedAttack(target: Creep): ScreepsReturnCode
  fun rangedAttack(target: Structure): ScreepsReturnCode
  fun rangedHeal(target: Creep): ScreepsReturnCode
  fun rangedMassAttack(target: Creep): ScreepsReturnCode
  fun rangedMassAttack(target: Structure): ScreepsReturnCode
  fun repair(target: Structure): ScreepsReturnCode
  fun reserveController(controller: StructureController): ScreepsReturnCode
  fun say(message: String, toPublic: Boolean? = definedExternally): ScreepsReturnCode
  fun signController(controller: StructureController, text: String): ScreepsReturnCode
  fun suicide(): ScreepsReturnCode
  fun transfer(target: Creep, resourceType: ResourceConstant, amount: Int? = definedExternally): ScreepsReturnCode
  fun transfer(target: Structure, resourceType: ResourceConstant, amount: Int? = definedExternally): ScreepsReturnCode
  fun upgradeController(target: StructureController): ScreepsReturnCode
  fun withdraw(
    target: Structure,
    resourceType: ResourceConstant,
    amount: Int? = definedExternally
  ): ScreepsReturnCode

  fun withdraw(
    target: Tombstone,
    resourceType: ResourceConstant,
    amount: Int? = definedExternally
  ): ScreepsReturnCode
}