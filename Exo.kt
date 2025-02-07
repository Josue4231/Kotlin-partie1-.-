/*fun main(){     //Exo1
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
    else if (variable=="difference"){
        println(x != y )
    }

}*/

/*fun main() {
    println("Entrer votre age: ")
    val ageInput = readln()
    val x : Int = 26
    val age = ageInput.toIntOrNull()
    if (age != null) {
    if (age > x  ){
        println("Pas de tarif reduit ")
    }
    else if (age < x ){
        println("Tarif reduit ")
    }
    else {
        println("Tarif non eligible")
    }
    }
}*/

/*fun main(){ //exo 2
    println("Entrer un nombre")
    val xInput= readln()
    val x = xInput.toIntOrNull()
    println("Entrer un autre nombre")
    val yInput= readln()
    val y = yInput.toIntOrNull()
    if ( x  != null && y !=null) {
        if (x > 0 && y > 0) {
            println("les deux nombre x et y  sont positif ")
        } else if (x < 0 && y > 0) {
            println("les deux nombre sont négatif")
        }
    }
}*/

/*fun main(){ //exo3
    println("Entrer votre année")
    val annee = readln().toInt()

    if(annee !=0){
        if (annee % 4 == 0 || annee % 100 == 0 ){
            println(" $annee est bixetile ")
        }
        else if (annee % 400 == 0 ){
            println("$annee est bixetile ")
        }
        else {
            println("$annee est non bixetile ")
        }
    }
}*/

fun main(){
    var i = 1
    while (i<22){
        println(i)
        i=i+1
        if (i==21){
            break
        }
    }
}