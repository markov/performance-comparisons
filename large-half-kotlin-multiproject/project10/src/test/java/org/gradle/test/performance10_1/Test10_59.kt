package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_59 {
    private val production = Production10_59("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}