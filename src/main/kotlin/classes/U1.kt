package classes

class U1: Rocket() {
    override val cost: Int = 100
    override val weight: Int = 10000
    override val maxWeight: Int = 18000
    override val chanceLauchExplotion: Int = 5
    override val chanceLandingExplotion: Int = 1
    override var currentWeight: Int = 0

    override fun launch(): Boolean {
        return (0..100).random() in 0..(chanceLauchExplotion * (currentWeight / maxWeight)) // true - explotó
    }

    override fun land(): Boolean {
        return (0..100).random() in 0..(chanceLandingExplotion * (currentWeight / maxWeight))
    }
}