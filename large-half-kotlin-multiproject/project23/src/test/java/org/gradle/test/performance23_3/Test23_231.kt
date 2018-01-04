package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_231 {
    private val production = Production23_231("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}