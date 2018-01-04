package org.gradle.test.performance49_2

import org.junit.Assert.*

class Test49_164 {
    private val production = Production49_164("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
