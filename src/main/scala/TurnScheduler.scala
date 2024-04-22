import characters.TraitCharacter

import scala.collection.mutable.ArrayBuffer

class TurnScheduler {

  private var loadingZone: ArrayBuffer[TraitCharacter] = new ArrayBuffer()
  private var waitingZone: ArrayBuffer[TraitCharacter] = new ArrayBuffer()

  def addLoadingZone(c: TraitCharacter): Unit = {
    loadingZone += c
  }

  def removeLoadingZone(c: TraitCharacter): Unit = {
    loadingZone -= c
  }

  def addWaitingZone(c: TraitCharacter): Unit = {
    waitingZone += c
  }

  def removeWaitingZone(c: TraitCharacter): Unit = {
    waitingZone -= c
  }

  def calculateMaxActionBar: Double = {
    var maxActionBar = loadingZone.map(_.getActionBar): ArrayBuffer[Double]
  }

  def resetActionBar: Unit = {
      waitingZone.foreach(_.actionPoints *= 0.0)
  }

  def increaseActionPoints(amount: Double): Unit = {
    loadingZone.foreach(_.actionPoints += amount)
  }

}
