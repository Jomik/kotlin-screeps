@file:Suppress("unused")

package screeps

import screeps.structure.Structure

external interface Identifiable {
  val id: String
}

external interface Named {
  val name: String
}

external interface NavigationTarget
external interface HasPos : NavigationTarget {
  val pos: RoomPosition
}

external interface HasCoordinates : NavigationTarget {
  val x: Int
  val y: Int
  val roomName: String
}

external interface PortalDestination
external interface InterShardDestination : PortalDestination {
  val shard: String
  val room: Room
}

external interface Owned {
  val my: Boolean
  val owner: Owner

  interface Owner {
    val username: String
  }

}

external interface StoreDefinition : Record<ResourceConstant, Int?> {
  val energy: Int
  val power: Int?
}

external interface Harvestable {
  val ticksToRegeneration: Int
}

external interface EnergyContainer {
  val energy: Int
  val energyCapacity: Int
}

external interface Decaying {
  val ticksToDecay: Int
}

external interface PathStep {
  val x: Int
  val dx: Int
  val y: Int
  val dy: Int
  val direction: DirectionConstant
}

external interface FindPathOptions {
  val ignoreCreeps: Boolean?
  val ignoreDestructibleStructures: Boolean?
  val ignoreRoads: Boolean?
  val costCallback: ((roomName: String, costMatrix: PathFinder.CostMatrix) -> PathFinder.CostMatrix)?
  val maxOps: Int?
  val heuristicWeight: Double?
  val serialize: Boolean?
  val maxRooms: Int?
  val range: Int?
}

external interface MoveToOptions : FindPathOptions {
  val reusePath: Int?
  val serializeMemory: Boolean?
  val noPathFinding: Boolean?
  val visualizePathStyle: RoomVisual.PolyStyle?
}

external interface RoomPositionWithRange {
  val pos: RoomPosition
  val range: Int
}

external interface FilterOption<T> {
  val filter: (T) -> Boolean?
}

external interface FindClosestByPathOptions<T> : FindPathOptions, FilterOption<T> {
  val algorithm: AlgorithmConstant?
}

external interface LookAtResult {
  val type: LookConstant
  val creep: Creep?
  val structure: Structure?
  val terrain: String?
  val constructionSite: ConstructionSite?
  val resource: Resource?
}

external interface LookAtAreaArrayItem : LookAtResult {
  val x: Int
  val y: Int
}

typealias LookAtAreaResult = Record<Int, Record<Int, Array<LookAtResult>>>
