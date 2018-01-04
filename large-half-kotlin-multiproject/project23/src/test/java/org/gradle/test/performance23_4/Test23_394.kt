package org.gradle.test.performance23_4

import org.junit.Assert.*

class Test23_394 {
    private val production = Production23_394("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}