package problem1

fun main(args: Array<String>) {
    var sum = 0
    val range = 1..9

    range.forEach {
        if(it % 3 == 0 || it % 5 == 0) {
            sum += it
        }
    }

    println(sum)
}