@file:Suppress("unused")

package screeps

abstract external class RoomObject: HasPos {
  override val pos: RoomPosition
  val room: Room
}