import screeps.*

fun foo() {
  for (c in Game.creeps.values) {
    console.log(c)
  }
  for (n in Game.creeps.keys) {
    console.log(n)
  }
  for ((n, c) in Game.creeps.entries) {
    console.log(n, c)
  }

  Game.creeps.asIterable().filter { (_, c) ->
    c.pos.roomName === "W8N3"
  }

  val f = Game.rooms["foo"]
  Memory.creeps["foo"] = jsObject {
    bar = "bum"
  }
}

