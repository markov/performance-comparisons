package org.gradle.test.performance23_4

import org.junit.Assert.*

class Test23_370 {
    private val production = Production23_370("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}