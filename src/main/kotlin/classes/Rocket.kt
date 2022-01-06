package classes

import Item

open class Rocket: SpaceShip {
    open val cost = 0
    open val weight = 0
    open val maxWeight = 0
    open val chanceLauchExplotion = 0
    open val chanceLandingExplotion = 0
    open var currentWeight = 0

    override fun launch(): Boolean {
        return true
    }
    override fun land(): Boolean {
        return true
    }
    override fun canCarry(item: Item): Boolean {
        return maxWeight >= (item.weight + currentWeight)
    }
    override fun carry(item: Item) {
        currentWeight += item.weight
    }
}