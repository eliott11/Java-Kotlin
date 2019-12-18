fun main() {

    println(PLusouMonis())


}

fun PLusouMonis() {

    println("Player 1, Choose an number : ");
    var secret = readLine()!!.toInt()
    var attempt : Int = 0;

    do {
        println("Player 2, try to guess  4 to give up ");
        var user = readLine()!!.toInt();

        attempt++
        println(attempt)

        if (user > secret){
            println("Trop grand !")

        }

        if (user < secret) {
            println("Trop petit !")
        }
        if (user == secret){
            println("You won !!");
        }
        if (attempt == 3){
            println("3 attempts, you lost")
        }

        if (user ==  4){
            println("Game Cancelled")
        }

        if (user - secret in 1..9){
            println("Tu chauffes")
        }

        if (user - secret in 10..19){
            println("Tu refroidis")
        }

        if (user - secret in 19..20){
            println("T'es mort")
        }


    } while (user != secret)
}