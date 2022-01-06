package classes

class U2: Rocket() {
    override val cost: Int = 120000000
    override val weight: Int = 18000
    override val maxWeight: Int = 29000
    override val chanceLauchExplotion: Int = 4
    override val chanceLandingExplotion: Int = 8
    override var currentWeight: Int = 0

    override fun launch(): Boolean {
        return (0..1000).random() in 0..(((currentWeight / maxWeight) / 100) * chanceLauchExplotion)
    }

    override fun land(): Boolean {
        return (0..1000).random() in 0..((currentWeight / maxWeight) / 100 * chanceLandingExplotion)
    }
}
