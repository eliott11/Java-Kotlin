interface Animal {


    fun quiSuisje()
    fun parler()

}

fun main(){
    var mouton = Mouton()
    var dauphin = Dauphin()
    var vache = Vache()
    var animalerie =Animalerie()
    animalerie.add(mouton)
    animalerie.add(dauphin)
    animalerie.add(vache)
    animalerie.afficherAnimaux()




}
class Mouton:Animal {
    override fun quiSuisje() {
        println("Je suis un mouton !") //To change body of created functions use File | Settings | File Templates.
    }

    override fun parler() {
        println("Meeehhhhhh !") //To change body of created functions use File | Settings | File Templates.
    }

}
class Dauphin:Animal {
    override fun quiSuisje() {
        println("Je suis un dauphin !") //To change body of created functions use File | Settings | File Templates.
    }

    override fun parler() {
        println("Krkrkr !") //To change body of created functions use File | Settings | File Templates.
    }

}
class Vache:Animal {
    override fun quiSuisje() {
        println("Je suis une vache !") //To change body of created functions use File | Settings | File Templates.
    }

    override fun parler() {
        println("Mowww !") //To change body of created functions use File | Settings | File Templates.
    }

}
class Animalerie() {

    var listeOfAnimal=arrayListOf<Animal>()

    fun add(animal:Animal) {

        listeOfAnimal.add(animal)

    }
    fun afficherAnimaux(){
        listeOfAnimal.forEach {
            it.quiSuisje()
            it.parler()
        }
    }
}