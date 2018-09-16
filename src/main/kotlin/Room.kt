@file:Suppress("unused")

package screeps

import screeps.structure.StructureStorage
import screeps.structure.StructureTerminal

abstract external class Room : Named {
  val energyAvailable: Int
  val energyCapacityAvailable: Int
  val memory: RoomMemory
  val storage: StructureStorage?
  val terminal: StructureTerminal?
  val visual: RoomVisual

  fun createConstructionSite(x: Int, y: Int, structureType: StructureConstant): ScreepsReturnCode
  fun createConstructionSite(pos: RoomPosition, structureType: StructureConstant): ScreepsReturnCode
  fun createFlag(
    x: Int,
    y: Int,
    name: String = definedExternally,
    color: ColorConstant = definedExternally,
    secondaryColor: ColorConstant = definedExternally
  ): ScreepsReturnCode

  fun createFlag(
    pos: RoomPosition,
    name: String = definedExternally,
    color: ColorConstant = definedExternally,
    secondaryColor: ColorConstant = definedExternally
  ): ScreepsReturnCode

  fun <T : RoomObject> find(findConstant: FindConstant, opts: FilterOption<T> = definedExternally): Array<T>
  fun findExitTo(room: String): ExitConstant
  fun findExitTo(room: Room): ExitConstant
  fun findPath(fromPos: RoomPosition, toPos: RoomPosition, opts: FindPathOptions = definedExternally): Array<PathStep>
  fun getPositionAt(x: Int, y: Int): RoomPosition?
  fun lookAt(x: Int, y: Int): Array<LookAtResult>
  fun lookAt(target: NavigationTarget): Array<LookAtResult>

  fun <T : RoomObject> lookForAt(type: LookConstant, x: Int, y: Int): Array<T>
}

fun Room.lookAtArea(top: Int, left: Int, bottom: Int, right: Int): LookAtAreaResult =
  this.asDynamic().lookAtArea(top, left, bottom, right, false).unsafeCast<LookAtAreaResult>()

fun Room.lookAtAreaAsArray(top: Int, left: Int, bottom: Int, right: Int): Array<LookAtAreaArrayItem> =
  this.asDynamic().lookAtArea(top, left, bottom, right, true).unsafeCast<Array<LookAtAreaArrayItem>>()
