package org.gradle.test.performance23_5

import org.junit.Assert.*

class Test23_450 {
    private val production = Production23_450("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}