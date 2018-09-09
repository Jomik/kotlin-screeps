package screeps

abstract external class RoomVisual {
  interface PolyStyle {
    val fill: String?
    val opacity: Double?
    val stroke: String?
    val strokeWidth: Double?
    val lineStyle: LineStyleConstant
  }
}