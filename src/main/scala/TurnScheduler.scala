
import characters.player.TraitPlayer
import scala.collection.mutable.ArrayBuffer

class TurnScheduler {

  private var loadingZone: ArrayBuffer[TraitPlayer] = new ArrayBuffer()
  private var waitingZone: ArrayBuffer[TraitPlayer] = new ArrayBuffer()

  def addLoadingZone(c: TraitPlayer): Unit = {
    loadingZone += c
  }

  def removeLoadingZone(c: TraitPlayer): Unit = {
    loadingZone -= c
  }

  def addWaitingZone(c: TraitPlayer): Unit = {
    waitingZone += c
  }

  def removeWaitingZone(c: TraitPlayer): Unit = {
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
