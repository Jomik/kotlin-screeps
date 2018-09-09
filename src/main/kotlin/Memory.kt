package screeps

external object Memory {
  var creeps: MutableRecord<String, CreepMemory>
  var rooms: MutableRecord<String, RoomMemory>
  var spawns: MutableRecord<String, SpawnMemory>
  var flags: MutableRecord<String, FlagMemory>
}

external interface CreepMemory
external interface RoomMemory
external interface SpawnMemory
external interface FlagMemory
