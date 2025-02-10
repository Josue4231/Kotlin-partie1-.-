/*fun main(){     //Exo1.1
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

/*fun main(){ //exo 1.2
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

/*fun main(){ //exo1.3
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

/*fun main(){ //exo 2.1
    var i = 1
    while (i<22){
        println(i)
        i=i+1
        if (i==21){
            break
        }
    }
}*/



/*fun main(){ //exo 2.2
    while(true){
        println("Entrer un nombre pair ou impair :")
        val i = readln().toInt()
        var jojo = if (i%2==0){
            println(i)
              i+2

        }
        else {
            println(i)
            i+3


        }
        println("Le nouveau nombre est : $jojo")

        if(i==28){
            println("Le nombre est 28 on s'arrete ")
            break
        }
    }
}*/

/*fun main(){ //exo 2.3
    println("Entrer un nombre:")
    var i  = readln().toInt()
    while(i % 5 ==0 ){
        println(i)
        i = i + 5
        if(i==50){
            break
        }

    }

}*/
/*fun main() {//exo 3
    var tableau = arrayOf<Int>()
    for(i in 1..10){
        tableau += (1..100).random()
    }
    println(tableau.contentToString())
    println(tableau.sum())
    println(tableau.max())
    println(tableau.min())

    var tabpair = listOf<Int>()
    var tabimpair= listOf<Int>()


    for (element in tableau){
        if (element % 2==0){
            tabpair=tabpair.add
        }
        else {
            tabimpair.
        }

        }
}*/
fun main(){//4.2
    val i = 5
    for ( i in i downTo 1 )
        println(i)

    var x = 5 //4.1
    for (i in  1..x)
        println(i)

    var tabpair= intArrayOf(0,1,2,3,4,5,6,7,8,9,10)//exo4.3
    for (tabpair in 0..10 step 2 )
        print(tabpair)

    var tabimpair= intArrayOf(0,1,2,3,4,5,6,7,8,9,10)//exo4.4
    for (tabimpair in 0..10 step 3 )
        print(tabimpair)



}






