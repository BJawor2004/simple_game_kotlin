import kotlin.random.Random

fun printDifficulty(): Void?
{
    println("1. Easy")
    println("2. Normal")
    println("3. Hard")
    println("4. Hardcore")
    return null
}

fun easy(): Unit
{
    var lives: Int = 3
    println("Numbers between 0 - 9")
    println("3 lives")
    var x: Int = Random.nextInt(10)

    while(true)
    {
        println("Enter number: ")
        var y: Int = readln().toInt()
        if(y > x)
        {
            println("To much")
            lives = lives-1
            println("lives left: $lives")
            if(lives == 0)
            {
                println("Game over")
                println("Numbers was: $x")
                break
            }
            continue
        }
        else if(y < x)
        {
            println("Too low")
            lives = lives-1
            println("lives left: $lives")
            if(lives == 0)
            {
                println("Game over")
                println("Numbers was: $x")
                break
            }
            continue
        }
        else
        {
            println("Congratulations")
            println("lives left: $lives")
            break
        }
    }
}

fun normal(): Unit
{
    var lives: Int = 6
    println("Numbers between 0 - 19")
    println("6 lives")
    var x: Int = Random.nextInt(20)

    while(true)
    {
        println("Enter number ")
        var y: Int = readln().toInt()

        if(y > x)
        {
            println("To much")
            lives = lives-1
            println("lives left: $lives")
            if(lives == 0)
            {
                println("Game over")
                println("Numbers was: $x")
                break
            }
            continue
        }
        else if(y < x)
        {
            println("Too low")
            lives = lives-1
            println("lives left: $lives")
            if(lives == 0)
            {
                println("Game over")
                println("Numbers was: $x")
                break
            }
            continue
        }
        else
        {
            println("Congratulations")
            println("lives left: $lives")
            break
        }
    }
}

fun hard(): Unit
{
    var lives: Int = 10
    println("Numbers between 0 - 49")
    println("10 lives")
    var x: Int = Random.nextInt(50)

    while(true)
    {
        println("Enter number ")
        val y: Int = readln().toInt()
        if(y > x)
        {
            println("To much")
            lives = lives-1
            println("lives left: $lives")
            if(lives == 0)
            {
                println("Game over")
                println("Numbers was: $x")
                break
            }
            continue
        }
        else if(y < x)
        {
            println("Too low")
            lives = lives-1
            println("lives left: $lives")
            if(lives == 0)
            {
                println("Game over")
                println("Numbers was: $x")
                break
            }
            continue
        }
        else
        {
            println("Congratulations")
            println("lives left: $lives")
            break
        }
    }
}

fun hardcore(): Unit
{
    var lives: Int = 15
    println("Numbers between 0 - 99")
    var x: Int = Random.nextInt(100)
    println("15 lives")

    while(true)
    {
        println("Enter number: ")
        val y: Int = readln().toInt()
        if(y > x)
        {
            println("To much")
            lives = lives-1
            println("lives left: $lives")
            if(lives == 0)
            {
                println("Game over")
                println("Numbers was: $x")
                break
            }
            continue
        }
        else if(y < x)
        {
            println("Too low")
            lives = lives-1
            println("lives left: $lives")
            if(lives == 0)
            {
                println("Game over")
                println("Numbers was: $x")
                break
            }
            continue
        }
        else
        {
            println("Congratulations")
            println("lives left: $lives")
            break
        }
    }
}

fun main() {
    while(true) {
        println("Choose difficulty: ")
        printDifficulty()

        var choice: Int = readln().toInt()
        when (choice) {
            1 -> easy()
            2 -> normal()
            3 -> hard()
            4 -> hardcore()
            else -> {
                println("Invalid choice")
                continue
            }
        }
        println("Do you want to play again? (y/n)")
        val again = readln().lowercase()
        if(again != "y")
        {
            println("Thanks for playing")
            break
        }
    }
}
