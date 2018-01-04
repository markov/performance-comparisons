package org.gradle.test.performance49_2

import org.junit.Assert.*

class Test49_179 {
    private val production = Production49_179("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
