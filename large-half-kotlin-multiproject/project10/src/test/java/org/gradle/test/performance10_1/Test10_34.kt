package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_34 {
    private val production = Production10_34("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}