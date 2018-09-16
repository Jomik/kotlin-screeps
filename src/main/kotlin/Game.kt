@file:Suppress("unused")

package screeps

import screeps.structure.Structure
import screeps.structure.StructureSpawn

external object Game {
  val shard: Shard
  val map: Map
  val market: Market
  val gcl: GCL
  val cpu: CPU
  val time: Int

  val creeps: Record<String, Creep>
  val rooms: Record<String, Room>
  val flags: Record<String, Flag>
  val resources: Record<String, Int>
  val spawns: Record<String, StructureSpawn>
  val structures: Record<String, Structure>

  fun getObjectById(id: String): RoomObject?
  fun notify(message: String, groupInterval: Int?)

  interface CPU {
    val limit: Int
    val tickLimit: Int
    val bucket: Int
    val shardLimits: Record<String, Int>

    fun getUsed(): Double
    fun getHeapStatistics(): Any
    fun setShardLimits(limits: Record<String, Int>): ScreepsReturnCode
  }

  interface GCL {
    val level: Int
    val progress: Int
    val progressTotal: Int
  }

  interface Shard {
    val name: String
    val type: String
    val ptr: Boolean
  }

  interface Map {
    fun describeExits(roomName: String): Record<DirectionConstant, String>
    fun findExit(fromRoom: String, toRoom: String, opts: RouteOptions? = definedExternally): ExitConstant
    fun findRoute(fromRoom: String, toRoom: String, opts: RouteOptions? = definedExternally): Array<RouteResult>
    fun getRoomLinearDistance(roomName1: String, roomName2: String, continuous: Boolean? = definedExternally): Int
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

}

