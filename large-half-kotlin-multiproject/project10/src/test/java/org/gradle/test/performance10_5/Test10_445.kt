package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_445 {
    private val production = Production10_445("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}