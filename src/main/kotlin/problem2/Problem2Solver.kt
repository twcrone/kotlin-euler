package problem2

class Problem2Solver {
    fun solve(n: Int): Int {
        var sum = 0
        var current = 1
        var last = 2

        while(last < n) {
            if(last % 2 == 0) {
                sum += last
            }
            var i = current + last
            current = last
            last = i
        }

        return sum
    }
}