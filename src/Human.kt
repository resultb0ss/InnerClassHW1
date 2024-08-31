class Human(val name: String) {

   open inner class Head(){
       override fun toString(): String {
           return "Я голова умею думать"
       }

       open fun say(){
           println("Голова умеет не только думать но и говорить")
       }
   }

    open inner class Legs(){

        open fun info(): String {
            return "Ноги ходят"
        }

        open fun go(){
            println("Ноги дают возможность ходить")
        }


    }

    override fun toString(): String {
        return "$name имею руки и ноги"
    }
}