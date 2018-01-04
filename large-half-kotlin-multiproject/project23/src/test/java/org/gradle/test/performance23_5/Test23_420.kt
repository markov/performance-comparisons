package org.gradle.test.performance23_5

import org.junit.Assert.*

class Test23_420 {
    private val production = Production23_420("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}