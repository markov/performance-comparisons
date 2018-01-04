package org.gradle.test.performance23_4

import org.junit.Assert.*

class Test23_384 {
    private val production = Production23_384("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}