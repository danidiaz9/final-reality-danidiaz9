import characters.TraitCharacter

import scala.collection.mutable.ArrayBuffer

class TurnScheduler {

  private val loadingZone: ArrayBuffer[TraitCharacter] = new ArrayBuffer()
  private val waitingZone: ArrayBuffer[TraitCharacter] = new ArrayBuffer()

  def addLoadingZone(c: TraitCharacter): Unit = {
    loadingZone += c
  }

  def removeLoadingZone(c: TraitCharacter): Unit = {
    loadingZone -= c
  }

  private def addWaitingZone(c: TraitCharacter): Unit = {
    waitingZone += c
  }

  def removeWaitingZone(c: TraitCharacter): Unit = {
    waitingZone -= c
  }

  def actualActionBar(c: TraitCharacter): Double = {
     c.getActionBar - c.calculateMaxActionBar
  }

  private def updateActionBar(c: TraitCharacter, k: Int): Unit = {
    c.actionBar += k
  }

  private def resetActionBar(c: TraitCharacter): Double ={
    c.actionBar = 0.0
    c.actionBar
  }

  def resetActionBarParty(): Unit = {
    for (c <- waitingZone){
      resetActionBar(c)
    }
  }

  def updateLoadingZone(k: Int): Unit = {
    for (c <- loadingZone){
      updateActionBar(c,k)
    }
  }

  def completeActionBar(): Unit = {
    val turns: ArrayBuffer[TraitCharacter] = new ArrayBuffer()
    for (c <- loadingZone) {
      addWaitingZone(c)
    }
    for (c <- waitingZone) {
      if (c.getActionBar >= c.calculateMaxActionBar) {
        turns += c
      }
    }
  }

  val turns: Unit = {

  }
}
