package screeps

abstract external class Mineral : RoomObject, Harvestable {
  val density: DensityConstant
  val mineralAmount: Int
  val mineralType: MineralConstant
}