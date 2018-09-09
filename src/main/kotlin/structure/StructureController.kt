package screeps.structure

import screeps.Owned
import screeps.ScreepsReturnCode
import kotlin.js.Date

abstract external class StructureController : Structure, Owned {
  val level: Int
  val progress: Int
  val progressTotal: Int
  val reservation: ReservationDefinition?
  val safeMode: Int?
  val safeModeAvailable: Int
  val safeModeCooldown: Int?
  val sign: SignDefinition?
  val ticksToDowngrade: Int
  val upgradeBlocked: Int

  fun activateSafeMode(): ScreepsReturnCode
  fun unclaim(): ScreepsReturnCode

  interface ReservationDefinition {
    val username: String
    val ticksToEnd: Int
  }

  interface SignDefinition {
    val username: String
    val text: String
    val time: Int
    val datetime: Date
  }
}
