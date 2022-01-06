package classes

class U1: Rocket() {
    override var cost: Int = 100000000
    override val weight: Int = 10000
    override val maxWeight: Int = 18000
    override val chanceLauchExplotion: Int = 5
    override val chanceLandingExplotion: Int = 1
    override var currentWeight: Int = 0

    override fun launch(): Boolean {
        return (0..100).random() in 0..(chanceLauchExplotion * (currentWeight / maxWeight))
    }

    override fun land(): Boolean {
        val result = (0..100).random() in 0..(chanceLandingExplotion * (currentWeight / maxWeight))
        //if (result) println("si") else println("no")
        return result
                //(((currentWeight / maxWeight) / 100) * chanceLandingExplotion)
    }
}