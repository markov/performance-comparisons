package org.gradle.test.performance23_5

import org.junit.Assert.*

class Test23_490 {
    private val production = Production23_490("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}