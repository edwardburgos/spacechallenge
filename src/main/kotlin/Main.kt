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
    println("To send the U1 rocket safely in both phases, a budget of ${resultados.budgets[0]} is needed.")
    println("To send the U2 rocket safely in both phases, a budget of ${resultados.budgets[1]} is needed.")
}