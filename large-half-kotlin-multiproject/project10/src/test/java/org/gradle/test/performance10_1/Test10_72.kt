package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_72 {
    private val production = Production10_72("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}