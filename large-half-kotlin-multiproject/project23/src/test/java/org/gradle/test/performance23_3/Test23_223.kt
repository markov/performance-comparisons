package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_223 {
    private val production = Production23_223("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}