import kotlin.random.Random

fun main() {
    val y: Int = Random.nextInt(10)
    var lives: Int = 3
    while(true)
    {
        println("Enter number: ")
        val x: Int = readln().toInt()
        if(x > y)
        {
            println("To much")
            lives = lives-1
            if(lives == 0)
            {
                println("Game over ")
                break
            }
            println("Lives: $lives")
            continue
        }
        else if (x < y)
        {
            println("Too low")
            lives = lives-1
            if(lives == 0)
            {
                println("Game over ")
                break
            }
            println("Lives: $lives")
            continue
        }
        else
        {
            println("Congratulations")
            break;
        }
    }
}
