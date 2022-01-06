import classes.Simulation

fun main() {
    class Main() {
        val simulation = Simulation()
        val itemsPhase1 = simulation.loadItems("https://s3.amazonaws.com/video.udacity-data.com/topher/2017/December/5a372d67_phase-1/phase-1.txt")
        val itemsPhase2 = simulation.loadItems("https://s3.amazonaws.com/video.udacity-data.com/topher/2017/December/5a372d88_phase-2/phase-2.txt")
        val rocketsU1 = simulation.loadU1(ArrayList<Item>(itemsPhase1.plus(itemsPhase2)))
        val rocketsU2 = simulation.loadU2(ArrayList<Item>(itemsPhase1.plus(itemsPhase2)))
        val budgets = simulation.runSimulation(rocketsU1, rocketsU2)

    }
    var resultados = Main()
    println("Para u1 necesitamos ${resultados.budgets[0]} para u2 ${resultados.budgets[1]}")
//    for (elements in ArrayList<Item>(resultados.itemsPhase1.plus(resultados.itemsPhase2))) {
//        println("${elements.name} pesa ${elements.weight}")
//    }
 //  println(ArrayList<Item>(resultados.itemsPhase1.plus(resultados.itemsPhase2)))
    //simulation.runSimulation(rocketsU1, rocketsU2)
}