package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_415 {
    private val production = Production10_415("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}