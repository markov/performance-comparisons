package org.gradle.test.performance23_1

import org.junit.Assert.*

class Test23_46 {
    private val production = Production23_46("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}