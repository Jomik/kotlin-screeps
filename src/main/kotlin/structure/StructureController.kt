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
    var username: String
    var ticksToEnd: Int
  }

  interface SignDefinition {
    var username: String
    var text: String
    var time: Int
    var datetime: Date
  }
}
