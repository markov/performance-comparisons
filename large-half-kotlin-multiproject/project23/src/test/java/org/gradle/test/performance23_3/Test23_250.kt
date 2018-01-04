package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_250 {
    private val production = Production23_250("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}