package controller

import model.gameunits.character.Character
import model.gameunits.GameUnit
import model.gameunits.enemies.Enemy

import scala.collection.mutable

/** A class representing a turn scheduler in the game.
 *
 *  This class manages the turn order of gameunits during combat by handling their action bars.
 */
class TurnScheduler(gameUnits: List[GameUnit]) {

  private val actionBars = mutable.Map.empty[GameUnit, Double]
  gameUnits.foreach(actionBars += _ -> 0.0)

  private def getActionBars: Map[GameUnit, Double] = actionBars.toMap

  private val turnsQueue = mutable.Queue.empty[GameUnit]


  private def increaseActionBar(k: Int): Unit = {
    getActionBars.foreach{
      case (gameUnit: GameUnit, actionBar: Double) => actionBars(gameUnit) += k
        if(gameUnit.calculateMaxWeight <= actionBar){
          turnsQueue.enqueue(gameUnit)
        }
    }
  }

  private def resetActionBar(): Unit = {
    gameUnits.foreach(actionBars += _ -> 0.0)
  }

    /** Simulates combat between a character and an enemy character.
   *
   */
  def combat(u1: Character, u2: Enemy): Unit = {
    u1.attackEnemy(u2)
    u2.attackCharacter(u1)
  }
}