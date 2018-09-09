package screeps.structure

import screeps.*

abstract external class StructureSpawn : Structure, Owned, EnergyContainer, Named {
  val memory: SpawnMemory
  val spawning: Spawning?
  fun spawnCreep(body: Array<BodyPartConstant>, name: String, opts: SpawnOptions = definedExternally): ScreepsReturnCode
  fun recycleCreep(target: Creep): ScreepsReturnCode
  fun renewCreep(target: Creep): ScreepsReturnCode

  interface Spawning {
    val directions: Array<DirectionConstant>
    val name: String
    val needTime: Int
    val remainingTime: Int
    val spawn: StructureSpawn
    fun cancel(): ScreepsReturnCode
    fun setDirections(directions: Array<DirectionConstant>): ScreepsReturnCode
  }

  interface SpawnOptions {
    val memory: CreepMemory?
    val energyContainingStructures: Array<EnergyContainer>?
    val dryRun: Boolean?
    val directions: Array<DirectionConstant>?
  }
}
