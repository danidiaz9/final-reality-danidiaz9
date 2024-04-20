package characters

import scala.collection.mutable.ArrayBuffer

class TurnScheduler {

  private var loadingZone: ArrayBuffer[TCharacter] = new ArrayBuffer()
  private var waitingZone: ArrayBuffer[TCharacter] = new ArrayBuffer()

  def addLoadingZone(c: TCharacter): Unit = {
    loadingZone += c
  }

  def removeLoadingZone(c: TCharacter): Unit = {
    loadingZone -= c
  }

  def addWaitingZone(c: TCharacter): Unit = {
    waitingZone += c
  }

  def removeWaitingZone(c: TCharacter): Unit = {
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
