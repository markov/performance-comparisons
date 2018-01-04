package org.gradle.test.performance23_2

import org.junit.Assert.*

class Test23_117 {
    private val production = Production23_117("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}