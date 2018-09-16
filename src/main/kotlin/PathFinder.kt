@file:Suppress("unused")

package screeps

external object PathFinder {
  fun search(origin: RoomPosition, goal: RoomPosition, options: Options = definedExternally)
  fun search(origin: RoomPosition, goal: Array<RoomPosition>, options: Options = definedExternally)
  fun search(origin: RoomPosition, goal: RoomPositionWithRange, options: Options = definedExternally)
  fun search(origin: RoomPosition, goal: Array<RoomPositionWithRange>, options: Options = definedExternally)

  class CostMatrix {
    fun set(x: Int, y: Int, cost: Int)
    fun get(x: Int, y: Int): Int
    fun clone(): CostMatrix
    fun serialize(): Array<Int>

    companion object {
      fun deserialize(serializedCostMatrix: Array<Int>): CostMatrix
    }
  }

  interface Options {
    val plainCost: Int?
    val swampCost: Int?
    val flee: Boolean?
    val maxOps: Int?
    val maxRooms: Int?
    val maxCost: Int?
    val heuristicWeight: Double?
    val roomCallback: ((String) -> CostMatrix)?
  }

  interface Path {
    val path: Array<RoomPosition>
    val ops: Int
    val cost: Int
    val incomplete: Boolean
  }
}