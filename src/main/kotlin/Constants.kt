@file:Suppress("unused")

package screeps

external interface Constant<T>

inline val <T>Constant<T>.value: T get() = this.asDynamic().unsafeCast<T>()

external interface StringConstant : Constant<String>
external interface IntegerConstant : Constant<Int>

external interface FindConstant : IntegerConstant
external interface ExitConstant : FindConstant
external interface ScreepsReturnCode : IntegerConstant
external interface BodyPartConstant : StringConstant
external interface ActiveBodyPartConstant : BodyPartConstant
external interface StructureConstant : StringConstant
external interface BuildableStructureConstant : StructureConstant
external interface LookConstant : StringConstant
external interface DirectionConstant : IntegerConstant
external interface ResourceConstant : StringConstant
external interface MineralConstant : ResourceConstant
external interface ColorConstant : IntegerConstant
external interface DensityConstant : IntegerConstant
external interface OrderConstant : StringConstant
external interface MarketResourceConstant : ResourceConstant

external val OK: ScreepsReturnCode /* 0 */
external val ERR_NOT_OWNER: ScreepsReturnCode /* -1 */
external val ERR_NO_PATH: ScreepsReturnCode /* -2 */
external val ERR_NAME_EXISTS: ScreepsReturnCode /* -3 */
external val ERR_BUSY: ScreepsReturnCode /* -4 */
external val ERR_NOT_FOUND: ScreepsReturnCode /* -5 */
external val ERR_NOT_ENOUGH_RESOURCES: ScreepsReturnCode /* -6 */
external val ERR_NOT_ENOUGH_ENERGY: ScreepsReturnCode /* -6 */
external val ERR_INVALID_TARGET: ScreepsReturnCode /* -7 */
external val ERR_FULL: ScreepsReturnCode /* -8 */
external val ERR_NOT_IN_RANGE: ScreepsReturnCode /* -9 */
external val ERR_INVALID_ARGS: ScreepsReturnCode /* -10 */
external val ERR_TIRED: ScreepsReturnCode /* -11 */
external val ERR_NO_BODYPART: ScreepsReturnCode /* -12 */
external val ERR_NOT_ENOUGH_EXTENSIONS: ScreepsReturnCode /* -6 */
external val ERR_RCL_NOT_ENOUGH: ScreepsReturnCode /* -14 */
external val ERR_GCL_NOT_ENOUGH: ScreepsReturnCode /* -15 */

external val FIND_EXIT_TOP: ExitConstant /* 1 */
external val FIND_EXIT_RIGHT: ExitConstant /* 3 */
external val FIND_EXIT_BOTTOM: ExitConstant /* 5 */
external val FIND_EXIT_LEFT: ExitConstant /* 7 */
external val FIND_EXIT: FindConstant /* 10 */
external val FIND_CREEPS: FindConstant /* 101 */
external val FIND_MY_CREEPS: FindConstant /* 102 */
external val FIND_HOSTILE_CREEPS: FindConstant /* 103 */
external val FIND_SOURCES_ACTIVE: FindConstant /* 104 */
external val FIND_SOURCES: FindConstant /* 105 */
external val FIND_DROPPED_RESOURCES: FindConstant /* 106 */
external val FIND_STRUCTURES: FindConstant /* 107 */
external val FIND_MY_STRUCTURES: FindConstant /* 108 */
external val FIND_HOSTILE_STRUCTURES: FindConstant /* 109 */
external val FIND_FLAGS: FindConstant /* 110 */
external val FIND_CONSTRUCTION_SITES: FindConstant /* 111 */
external val FIND_MY_SPAWNS: FindConstant /* 112 */
external val FIND_HOSTILE_SPAWNS: FindConstant /* 113 */
external val FIND_MY_CONSTRUCTION_SITES: FindConstant /* 114 */
external val FIND_HOSTILE_CONSTRUCTION_SITES: FindConstant /* 115 */
external val FIND_MINERALS: FindConstant /* 116 */
external val FIND_NUKES: FindConstant /* 117 */
external val FIND_TOMBSTONES: FindConstant /* 118 */

external val TOP: DirectionConstant /* 1 */
external val TOP_RIGHT: DirectionConstant /* 2 */
external val RIGHT: DirectionConstant /* 3 */
external val BOTTOM_RIGHT: DirectionConstant /* 4 */
external val BOTTOM: DirectionConstant /* 5 */
external val BOTTOM_LEFT: DirectionConstant /* 6 */
external val LEFT: DirectionConstant /* 7 */
external val TOP_LEFT: DirectionConstant /* 8 */

external val COLOR_RED: ColorConstant /* 1 */
external val COLOR_PURPLE: ColorConstant /* 2 */
external val COLOR_BLUE: ColorConstant /* 3 */
external val COLOR_CYAN: ColorConstant /* 4 */
external val COLOR_GREEN: ColorConstant /* 5 */
external val COLOR_YELLOW: ColorConstant /* 6 */
external val COLOR_ORANGE: ColorConstant /* 7 */
external val COLOR_BROWN: ColorConstant /* 8 */
external val COLOR_GREY: ColorConstant /* 9 */
external val COLOR_WHITE: ColorConstant /* 10 */
external val COLORS_ALL: Array<ColorConstant>

external val STRUCTURE_EXTENSION: BuildableStructureConstant /* "extension" */
external val STRUCTURE_RAMPART: BuildableStructureConstant /* "rampart" */
external val STRUCTURE_ROAD: BuildableStructureConstant /* "road" */
external val STRUCTURE_SPAWN: BuildableStructureConstant /* "spawn" */
external val STRUCTURE_LINK: BuildableStructureConstant /* "link" */
external val STRUCTURE_WALL: BuildableStructureConstant /* "constructedWall" */
external val STRUCTURE_KEEPER_LAIR: StructureConstant /* "keeperLair" */
external val STRUCTURE_CONTROLLER: BuildableStructureConstant /* "controller" */
external val STRUCTURE_STORAGE: BuildableStructureConstant /* "carry" */
external val STRUCTURE_TOWER: BuildableStructureConstant /* "tower" */
external val STRUCTURE_OBSERVER: BuildableStructureConstant /* "observer" */
external val STRUCTURE_POWER_BANK: StructureConstant /* "powerBank" */
external val STRUCTURE_POWER_SPAWN: BuildableStructureConstant /* "powerSpawn" */
external val STRUCTURE_EXTRACTOR: BuildableStructureConstant /* "extractor" */
external val STRUCTURE_LAB: BuildableStructureConstant /* "lab" */
external val STRUCTURE_TERMINAL: BuildableStructureConstant /* "terminal" */
external val STRUCTURE_CONTAINER: BuildableStructureConstant /* "container" */
external val STRUCTURE_NUKER: BuildableStructureConstant /* "nuker" */
external val STRUCTURE_PORTAL: StructureConstant /* "portal" */
external val CONSTRUCTION_COST: Record<String, Int>
external val CONSTRUCTION_COST_ROAD_SWAMP_RATIO: Int /* 5 */

external val RESOURCE_ENERGY: ResourceConstant /* "energy" */
external val RESOURCE_POWER: ResourceConstant /* "power" */
external val RESOURCE_UTRIUM: MineralConstant /* "U" */
external val RESOURCE_LEMERGIUM: MineralConstant /* "L" */
external val RESOURCE_KEANIUM: MineralConstant /* "K" */
external val RESOURCE_GHODIUM: MineralConstant /* "G" */
external val RESOURCE_ZYNTHIUM: MineralConstant /* "Z" */
external val RESOURCE_OXYGEN: MineralConstant /* "O" */
external val RESOURCE_HYDROGEN: MineralConstant /* "H" */
external val RESOURCE_CATALYST: MineralConstant /* "X" */

external val RESOURCE_HYDROXIDE: ResourceConstant /* "OH" */
external val RESOURCE_ZYNTHIUM_KEANITE: ResourceConstant /* "ZK" */
external val RESOURCE_UTRIUM_LEMERGITE: ResourceConstant /* "UL" */
external val RESOURCE_UTRIUM_HYDRIDE: ResourceConstant /* "UH" */
external val RESOURCE_UTRIUM_OXIDE: ResourceConstant /* "UO" */
external val RESOURCE_KEANIUM_HYDRIDE: ResourceConstant /* "KH" */
external val RESOURCE_KEANIUM_OXIDE: ResourceConstant /* "KO" */
external val RESOURCE_LEMERGIUM_HYDRIDE: ResourceConstant /* "LH" */
external val RESOURCE_LEMERGIUM_OXIDE: ResourceConstant /* "LO" */
external val RESOURCE_ZYNTHIUM_HYDRIDE: ResourceConstant /* "ZH" */
external val RESOURCE_ZYNTHIUM_OXIDE: ResourceConstant /* "ZO" */
external val RESOURCE_GHODIUM_HYDRIDE: ResourceConstant /* "GH" */
external val RESOURCE_GHODIUM_OXIDE: ResourceConstant /* "GO" */
external val RESOURCE_UTRIUM_ACID: ResourceConstant /* "UH2O" */
external val RESOURCE_UTRIUM_ALKALIDE: ResourceConstant /* "UHO2" */
external val RESOURCE_KEANIUM_ACID: ResourceConstant /* "KH2O" */
external val RESOURCE_KEANIUM_ALKALIDE: ResourceConstant /* "KHO2" */
external val RESOURCE_LEMERGIUM_ACID: ResourceConstant /* "LH2O" */
external val RESOURCE_LEMERGIUM_ALKALIDE: ResourceConstant /* "LHO2" */
external val RESOURCE_ZYNTHIUM_ACID: ResourceConstant /* "ZH2O" */
external val RESOURCE_ZYNTHIUM_ALKALIDE: ResourceConstant /* "ZHO2" */
external val RESOURCE_GHODIUM_ACID: ResourceConstant /* "GH2O" */
external val RESOURCE_GHODIUM_ALKALIDE: ResourceConstant /* "GHO2" */
external val RESOURCE_CATALYZED_UTRIUM_ACID: ResourceConstant /* "XUH2O" */
external val RESOURCE_CATALYZED_UTRIUM_ALKALIDE: ResourceConstant /* "XUHO2" */
external val RESOURCE_CATALYZED_KEANIUM_ACID: ResourceConstant /* "XKH2O" */
external val RESOURCE_CATALYZED_KEANIUM_ALKALIDE: ResourceConstant /* "XKHO2" */
external val RESOURCE_CATALYZED_LEMERGIUM_ACID: ResourceConstant /* "XLH2O" */
external val RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE: ResourceConstant /* "XLHO2" */
external val RESOURCE_CATALYZED_ZYNTHIUM_ACID: ResourceConstant /* "XZH2O" */
external val RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE: ResourceConstant /* "ZXHO2" */
external val RESOURCE_CATALYZED_GHODIUM_ACID: ResourceConstant /* "XGH2O" */
external val RESOURCE_CATALYZED_GHODIUM_ALKALIDE: ResourceConstant /* "XGHO2" */

external val LOOK_CREEPS: LookConstant
external val LOOK_ENERGY: LookConstant
external val LOOK_RESOURCES: LookConstant
external val LOOK_SOURCES: LookConstant
external val LOOK_MINERALS: LookConstant
external val LOOK_STRUCTURES: LookConstant
external val LOOK_FLAGS: LookConstant
external val LOOK_CONSTRUCTION_SITES: LookConstant
external val LOOK_NUKES: LookConstant
external val LOOK_TERRAIN: LookConstant
external val LOOK_TOMBSTONES: LookConstant

external val WORK: ActiveBodyPartConstant
external val CARRY: ActiveBodyPartConstant
external val MOVE: ActiveBodyPartConstant
external val ATTACK: ActiveBodyPartConstant
external val RANGED_ATTACK: ActiveBodyPartConstant
external val TOUGH: ActiveBodyPartConstant
external val HEAL: ActiveBodyPartConstant
external val CLAIM: BodyPartConstant
external val BODYPART_COST: Record<BodyPartConstant, Int>

external val CREEP_SPAWN_TIME: Int /* 3 */
external val CREEP_LIFE_TIME: Int /* 1500 */
external val CREEP_CLAIM_LIFE_TIME: Int /* 500 */
external val CREEP_CORPSE_RATE: Double /* 0.2 */
external val OBSTACLE_OBJECT_TYPES: Array<String>
external val ENERGY_REGEN_TIME: Int /* 300 */
external val ENERGY_DECAY: Int /* 1000 */
external val REPAIR_COST: Double /* 0.01 */
external val RAMPART_DECAY_AMOUNT: Int /* 300 */
external val RAMPART_DECAY_TIME: Int /* 100 */
external val RAMPART_HITS: Int /* 1 */
external val ROAD_HITS: Int /* 5000 */
external val ROAD_WEAROUT: Int /* 1 */
external val ROAD_DECAY_AMOUNT: Int /* 100 */
external val ROAD_DECAY_TIME: Int /* 1000 */
external val LINK_HITS: Int /* 1000 */
external val LINK_HITS_MAX: Int /* 1000 */
external val LINK_CAPACITY: Int /* 800 */
external val LINK_COOLDOWN: Int /* 1 */
external val LINK_LOSS_RATIO: Double /* 0.03 */
external val STORAGE_CAPACITY: Int /* 1000000 */
external val STORAGE_HITS: Int /* 10000 */
external val BODYPARTS_ALL: Array<BodyPartConstant>
external val CARRY_CAPACITY: Int /* 50 */
external val HARVEST_POWER: Int /* 2 */
external val HARVEST_MINERAL_POWER: Int /* 1 */
external val REPAIR_POWER: Int /* 100 */
external val DISMANTLE_POWER: Int /* 50 */
external val BUILD_POWER: Int /* 5 */
external val ATTACK_POWER: Int /* 30 */
external val UPGRADE_CONTROLLER_POWER: Int /* 1 */
external val RANGED_ATTACK_POWER: Int /* 10 */
external val HEAL_POWER: Int /* 12 */
external val RANGED_HEAL_POWER: Int /* 4 */
external val DISMANTLE_COST: Double /* 0.005 */

external val SYSTEM_USERNAME: String
external val SIGN_NOVICE_AREA: String
external val SIGN_RESPAWN_AREA: String

external val SOURCE_ENERGY_CAPACITY: Int
external val SOURCE_ENERGY_NEUTRAL_CAPACITY: Int
external val SOURCE_ENERGY_KEEPER_CAPACITY: Int

external val MINERAL_REGEN_TIME: Int
external val MINERAL_DENSITY_CHANGE: Double
external val MINERAL_MIN_AMOUNT: Record<MineralConstant, Int>
external val MINERAL_RANDOM_FACTOR: Double
external val MINERAL_DENSITY: Record<DensityConstant, Int>
external val MINERAL_DENSITY_PROBABILITY: Record<DensityConstant, Double>
external val DENSITY_LOW: DensityConstant
external val DENSITY_MODERATE: DensityConstant
external val DENSITY_HIGH: DensityConstant
external val DENSITY_ULTRA: DensityConstant

external val NUKER_HITS: Int
external val NUKER_COOLDOWN: Int
external val NUKER_ENERGY_CAPACITY: Int
external val NUKER_GHODIUM_CAPACITY: Int
external val NUKE_LAND_TIME: Int
external val NUKE_RANGE: Int
external val NUKE_DAMAGE: Record<Int, Int>

external val CONTROLLER_DOWNGRADE: Record<Int, Int>
external val CONTROLLER_DOWNGRADE_RESTORE: Int
external val CONTROLLER_DOWNGRADE_SAFEMODE_THRESHOLD: Int
external val CONTROLLER_CLAIM_DOWNGRADE: Int
external val CONTROLLER_RESERVE: Int
external val CONTROLLER_RESERVE_MAX: Int
external val CONTROLLER_MAX_UPGRADE_PER_TICK: Int
external val CONTROLLER_ATTACK_BLOCKED_UPGRADE: Int
external val CONTROLLER_NUKE_BLOCKED_UPGRADE: Int

external val SAFE_MODE_DURATION: Int
external val SAFE_MODE_COOLDOWN: Int
external val SAFE_MODE_COST: Int

external val ORDER_SELL: OrderConstant
external val ORDER_BUY: OrderConstant

external val SUBSCRIPTION_TOKEN: MarketResourceConstant

external interface TerrainConstant : StringConstant
external interface LineStyleConstant : StringConstant
external interface AlgorithmConstant : StringConstant

val TERRAIN_PLAIN: TerrainConstant = "plain".unsafeCast<TerrainConstant>()
val TERRAIN_SWAMP: TerrainConstant = "swamp".unsafeCast<TerrainConstant>()
val TERRAIN_WALL: TerrainConstant = "wall".unsafeCast<TerrainConstant>()

val LINE_STYLE_DASHED: LineStyleConstant = js("dashed").unsafeCast<LineStyleConstant>()
val LINE_STYLE_DOTTED: LineStyleConstant = js("dotted").unsafeCast<LineStyleConstant>()
val LINE_STYLE_SOLID: LineStyleConstant = js("solid").unsafeCast<LineStyleConstant>()

val ALGORITHM_ASTAR: AlgorithmConstant = js("astar").unsafeCast<AlgorithmConstant>()
val ALGORITHM_DIJKSTRA: AlgorithmConstant = js("dijkstra").unsafeCast<AlgorithmConstant>()
