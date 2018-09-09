package screeps.structure

import screeps.Decaying
import screeps.PortalDestination

abstract external class StructurePortal : Structure, Decaying {
  val destination: PortalDestination
}