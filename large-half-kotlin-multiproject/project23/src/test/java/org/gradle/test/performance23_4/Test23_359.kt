package org.gradle.test.performance23_4

import org.junit.Assert.*

class Test23_359 {
    private val production = Production23_359("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}