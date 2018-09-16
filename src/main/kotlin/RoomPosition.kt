@file:Suppress("unused")

package screeps

external class RoomPosition(x: Int, y: Int, roomName: String) : HasCoordinates, PortalDestination {
  override val x: Int
  override val y: Int
  override val roomName: String

  fun createConstructionSite(
    structureType: BuildableStructureConstant,
    name: String? = definedExternally
  ): ScreepsReturnCode

  fun createFlag(
    name: String? = definedExternally,
    color: ColorConstant? = definedExternally,
    secondaryColor: ColorConstant? = definedExternally
  ): ScreepsReturnCode

  fun <T : RoomObject> findClosestByPath(
    objects: Array<NavigationTarget>,
    opts: FindClosestByPathOptions<T>? = definedExternally
  ): T?

  fun <T : RoomObject> findClosestByPath(
    type: FindConstant,
    opts: FindClosestByPathOptions<T>? = definedExternally
  ): T?

  fun <T : RoomObject> findClosestByRange(
    objects: Array<NavigationTarget>,
    opts: FilterOption<T>? = definedExternally
  ): T?

  fun <T : RoomObject> findClosestByRange(
    type: FindConstant,
    opts: FilterOption<T>? = definedExternally
  ): T?

  fun <T : RoomObject> findInRange(
    objects: Array<NavigationTarget>,
    range: Int,
    opts: FilterOption<T>? = definedExternally
  ): Array<T>

  fun <T : RoomObject> findInRange(
    type: FindConstant,
    range: Int, opts: FilterOption<T>? = definedExternally
  ): Array<T>

  fun getDirectionTo(x: Int, y: Int): DirectionConstant
  fun getDirectionTo(target: NavigationTarget): DirectionConstant
  fun getRangeTo(x: Int, y: Int): Int
  fun getRangeTo(target: NavigationTarget): Int
  fun inRangeTo(x: Int, y: Int, range: Int): Boolean
  fun inRangeTo(target: NavigationTarget, range: Int): Boolean
  fun isEqualTo(x: Int, y: Int): Boolean
  fun isEqualTo(target: NavigationTarget): Boolean
  fun isNearTo(x: Int, y: Int): Boolean
  fun isNearTo(target: NavigationTarget): Boolean
  fun look(): Array<LookAtResult>
  fun <T> lookFor(type: LookConstant): Array<T>
}