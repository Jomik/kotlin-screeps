package screeps.utilities

import screeps.*
import screeps.structure.StructureSpawn.SpawnOptions

fun spawnOptions(
  memory: CreepMemory? = null,
  energyContainingStructures: Array<EnergyContainer>? = null,
  dryRun: Boolean = false,
  directions: Array<DirectionConstant>? = null
): SpawnOptions = jsObject {
  this.memory = memory
  this.energyContainingStructures = energyContainingStructures
  this.dryRun = dryRun
  this.directions = directions
}

fun <T> filter(
  filter: (T) -> Boolean
): FilterOption<T> = jsObject {
  this.filter = filter
}

fun <T> routeOptions(
  routeCallback: (roomName: String, fromRoomName: String) -> Double
): Map.RouteOptions =
  jsObject {
    this.routeCallback = routeCallback
  }

fun orderFilter(
  resourceType: MarketResourceConstant? = null,
  id: String? = null,
  created: Int? = null,
  type: OrderConstant? = null,
  roomName: String? = null,
  amount: Int? = null,
  remainingAmount: Int? = null,
  price: Double? = null
): Market.Order.Filter = jsObject {
  this.resourceType = resourceType
  this.id = id
  this.created = created
  this.type = type
  this.roomName = roomName
  this.amount = amount
  this.remainingAmount = remainingAmount
  this.price = price
}

