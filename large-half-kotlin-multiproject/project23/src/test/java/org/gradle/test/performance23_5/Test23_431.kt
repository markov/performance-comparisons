package org.gradle.test.performance23_5

import org.junit.Assert.*

class Test23_431 {
    private val production = Production23_431("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}