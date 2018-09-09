@file:Suppress("unused")

package screeps

external object Game {
  val shard: Shard
  val map: Map
  val market: Market
  val gcl: GCL
  val cpu: CPU
  val time: Int

  val creeps: Record<String, Creep>
  val rooms: Record<String, Room>
  val flags: Record<String, Any>
  val resources: Record<String, Int>
  val spawns: Record<String, Any>
  val structures: Record<String, Any>

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
}

