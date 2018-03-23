package problem2

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

object Problem2SolverSpec : Spek({
    given("a problem 1 solver") {
        val solver = Problem2Solver()
        on("Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.") {
            val sum = solver.solve(4000000)
            it("should return 23") {
                assertEquals(sum, 4613732)
            }
        }
    }
})
