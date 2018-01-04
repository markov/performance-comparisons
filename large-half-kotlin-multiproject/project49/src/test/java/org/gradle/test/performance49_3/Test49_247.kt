package org.gradle.test.performance49_3

import org.junit.Assert.*

class Test49_247 {
    private val production = Production49_247("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
