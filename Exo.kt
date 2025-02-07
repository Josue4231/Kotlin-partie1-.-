fun main(){     //Exo1 
    println("Entrer un nom")
    val name = readln()
    var x=10
    var y = 5
    println("Entrer une variable:" )
    var variable = readln()
    if (variable=="somme"){
        println(x+y)
    }
    else if  (variable==" produit "){
        println(x*y)
    }
    else if (variable=="division"){
        if ( x > y ){
            println(x/y)
        }
    }
    else {
        println(4 != y )
    }

}
