package screeps

abstract external class Flag : RoomObject, Named {
  val color: ColorConstant
  val memory: FlagMemory
  val secondaryColor: ColorConstant

  fun remove()
  fun setColor(color: ColorConstant, secondaryColor: ColorConstant = definedExternally): ScreepsReturnCode
  fun setPosition(x: Int, y: Int): ScreepsReturnCode
  fun setPosition(pos: RoomPosition): ScreepsReturnCode
}