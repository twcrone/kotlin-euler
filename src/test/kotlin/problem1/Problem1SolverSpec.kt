package problem1

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

object Problem1SolverSpec : Spek({
    given("a problem 1 solver") {
        val solver = Problem1Solver()
        on("solve 9") {
            val sum = solver.solve(9)
            it("should return 23") {
                assertEquals(sum, 23)
            }
        }
        on("solve 999") {
            val sum = solver.solve(999)
            it("should return 233168") {
                assertEquals(sum, 233168)
            }
        }
    }
})