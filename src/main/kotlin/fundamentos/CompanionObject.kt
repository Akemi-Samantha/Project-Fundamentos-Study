package fundamentos

class MyFirstClass(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    companion object{
        fun criarComValoresPadrao(): MyFirstClass{
            return MyFirstClass("Kemi", "Rua 123", 21)

        }
    }
}

class SecondClass(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    fun criarComValoresPadrao(): SecondClass{
        return SecondClass("Kemi", "Rua 123", 21)
    }
}

fun main(){

    var secondclass = SecondClass("d","jj",23).criarComValoresPadrao() // Precisa add os valores, instanciar a classe

    var myfirstclass =  MyFirstClass.criarComValoresPadrao() // Com o campanion objects não precisa instanciar, pois já acessa os valores...
}
