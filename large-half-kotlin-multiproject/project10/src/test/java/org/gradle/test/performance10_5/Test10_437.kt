package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_437 {
    private val production = Production10_437("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}