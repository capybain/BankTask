fun main(){
    var balance:Double = 35000.toDouble()
    print ("Сколько денег вы хотите снять?")
    val amount = readLine()?.toIntOrNull ()
    if (amount != null && amount <= balance) {
        val NewBalance = balance - amount
        println("Успешно, баланс равен: $NewBalance")
    }
    else
        println("У вас недостаточно средств на счету, хотите узнать свой баланс? (1.да/2.нет)")
    val choice = readLine()
    when(choice){
        "1" -> println("Баланс: $balance")
        "2" -> println("Спасибо, до свидания")
        else -> println("Ошибка, до свидания")

    }

}