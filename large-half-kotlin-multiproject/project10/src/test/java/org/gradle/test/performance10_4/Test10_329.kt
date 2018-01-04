package org.gradle.test.performance10_4

import org.junit.Assert.*

class Test10_329 {
    private val production = Production10_329("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}