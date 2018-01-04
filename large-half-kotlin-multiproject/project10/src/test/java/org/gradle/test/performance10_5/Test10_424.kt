package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_424 {
    private val production = Production10_424("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}