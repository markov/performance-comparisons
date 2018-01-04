package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_78 {
    private val production = Production10_78("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}