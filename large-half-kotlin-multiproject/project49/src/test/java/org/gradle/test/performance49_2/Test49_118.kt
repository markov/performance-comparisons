package org.gradle.test.performance49_2

import org.junit.Assert.*

class Test49_118 {
    private val production = Production49_118("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
