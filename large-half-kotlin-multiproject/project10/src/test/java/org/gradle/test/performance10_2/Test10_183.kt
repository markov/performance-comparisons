package org.gradle.test.performance10_2

import org.junit.Assert.*

class Test10_183 {
    private val production = Production10_183("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}