package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_265 {
    private val production = Production23_265("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}