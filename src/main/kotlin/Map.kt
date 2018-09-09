package screeps

external interface Map {
  fun describeExits(roomName: String): Record<DirectionConstant, String>
  fun findExit(fromRoom: String, toRoom: String, opts: RouteOptions = definedExternally): ExitConstant
  fun findRoute(fromRoom: String, toRoom: String, opts: RouteOptions = definedExternally): Array<RouteResult>
  fun getRoomLinearDistance(roomName1: String, roomName2: String, continuous: Boolean = definedExternally): Int
  fun getTerrainAt(x: Int, y: Int, roomName: String): TerrainConstant
  fun getTerrainAt(pos: RoomPosition): TerrainConstant
  fun getWorldSize(): Int
  fun isRoomAvailable(roomName: String): Boolean

  interface RouteResult {
    val exit: ExitConstant
    val room: String
  }

  interface RouteOptions {
    val routeCallback: (roomName: String, fromRoomName: String) -> Double
  }
}

