package org.gradle.test.performance23_5

import org.junit.Assert.*

class Test23_463 {
    private val production = Production23_463("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}