package de.htwg.se.DungeonsOfDoom.model.board

class Map(var map: Array[Array[Field]] = new Array[Array[Field]](0), var playerSpawnPoint: (Int, Int) = (0, 0)) { //scalastyle:ignore
  if (map.isEmpty) {
    val result = MapFactory.generate()
    map = result._1
    playerSpawnPoint = result._2
  }

  /*override def toString : String = {
    val s = ""
    for(i <- map.indices) {
      for(j <- map(i).indices ) {
        s.concat(map(i)(j) match {
          case x : Floor => x.toString
          case x : Door => {
            if (x.isOpen) {
              "'"
            }
            else {
              "+"
            }
          }
          case _ : Wall => "#"
          case _ => " "
        })
      }
      s.concat("\n")
    }
    s
  }*/
}
