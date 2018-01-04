package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_10 {
    private val production = Production10_10("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}