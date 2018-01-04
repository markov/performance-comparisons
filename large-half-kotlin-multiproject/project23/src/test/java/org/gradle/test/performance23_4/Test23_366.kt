package org.gradle.test.performance23_4

import org.junit.Assert.*

class Test23_366 {
    private val production = Production23_366("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}