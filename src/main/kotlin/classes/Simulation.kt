package classes

import java.net.URL
import java.util.ArrayList
import Item

class Simulation {
    fun loadItems(url: String): ArrayList<Item> {
        val elements = URL(url).readText()
        val elementsArray: ArrayList<Item> = arrayListOf()
        for (element in elements.lines()) {
            val itemString = element.split("=")
            if (itemString[0] != "" && itemString[1] != "") elementsArray.add(Item(itemString[0], itemString[1].toInt()))
        }
        return elementsArray
    }

    fun loadU1(itemsArray: ArrayList<Item>): ArrayList<U1> {
        val rocketsU1: ArrayList<U1> = arrayListOf()
        var currentRocket = U1()
        for (element in itemsArray) {
            if (currentRocket.canCarry(element)) {
                currentRocket.carry(element)
            } else {
                rocketsU1.add(currentRocket)
                currentRocket = U1()
                currentRocket.carry(element)
            }
        }
        return rocketsU1
    }

    fun loadU2(itemsArray: ArrayList<Item>): ArrayList<U2> {
        val rocketsU2: ArrayList<U2> = arrayListOf()
        var currentRocket = U2()
        for (element in itemsArray) {
            if (currentRocket.canCarry(element)) {
                currentRocket.carry(element)
            } else {
                rocketsU2.add(currentRocket)
                currentRocket = U2()
                currentRocket.carry(element)
            }
        }
        return rocketsU2
    }

    fun runSimulation(rocketsU1Array: ArrayList<U1>, rocketsU2Array: ArrayList<U2>): Array<Int> {
        var totalBudgetU1 = 0
        var totalBudgetU2 = 0
        for (element in rocketsU1Array) {

            totalBudgetU1 += element.cost
            while (element.launch() || element.land()) {
                totalBudgetU1 += element.cost
            }
        }
        for (element in rocketsU2Array) {
            totalBudgetU2 += element.cost
            while (element.launch() || element.land()) {
                totalBudgetU2 += element.cost
            }
        }
        return arrayOf(totalBudgetU1, totalBudgetU2)
    }
}