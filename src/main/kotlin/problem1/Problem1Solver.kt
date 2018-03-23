package problem1

class Problem1Solver {
    fun solve(n: Int): Int {
        var sum = 0
        val range = 1..n

        range.forEach {
            if(it % 3 == 0 || it % 5 == 0) {
                sum += it
            }
        }

        return sum
    }
}