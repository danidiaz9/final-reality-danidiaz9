
import characters.player.TraitPlayer
import characters.{Party, TraitCharacter}

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

  private def calculateMaxActionBarC(c: TraitPlayer): Double = {
    val charWeight = c.getWeight
    val weaponWeight = c.getWeapon.getWeight
    val maxActionBarC = charWeight + 0.5 * weaponWeight
    maxActionBarC

  }

  private def calculateMaxActionBarE(e: TraitCharacter): Double = {
    val enemyWeight = e.getWeight
    val maxActionBarE = enemyWeight
    maxActionBarE

  }

  def actualActionBarC(c: TraitPlayer): Double = {
    calculateMaxActionBarC(c) - c.getActionBar
  }
  def actualActionBarE(e: TraitCharacter): Double = {
    calculateMaxActionBarE(e) - e.getActionBar
  }

  private def updateActionBarC(c: TraitPlayer, k: Int): Unit = {
    c.actionBar += k
  }

  def updateActionBarE(e: TraitCharacter, k: Int): Unit = {
    e.actionBar += k
  }

  def resetActionBarC(c: TraitPlayer): Double ={
    c.actionBar = 0.0
    c.actionBar
  }

  def resetActionBarParty(): Unit = {
    for (c <- waitingZone){
      resetActionBarC(c)
    }
  }

  def resetActionBarE(e: TraitCharacter): Double = {
    e.actionBar = 0.0
    e.actionBar
  }

  def updateLoadingZone(k: Int): Unit = {
    for (c <- loadingZone){
      updateActionBarC(c,k)
    }
  }

 def completeActionBar

}
