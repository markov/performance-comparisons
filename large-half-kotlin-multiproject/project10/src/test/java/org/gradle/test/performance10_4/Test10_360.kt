package org.gradle.test.performance10_4

import org.junit.Assert.*

class Test10_360 {
    private val production = Production10_360("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}