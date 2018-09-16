@file:Suppress("unused")

package screeps

abstract external class Mineral : RoomObject, Harvestable, Identifiable {
  val density: DensityConstant
  val mineralAmount: Int
  val mineralType: MineralConstant
}