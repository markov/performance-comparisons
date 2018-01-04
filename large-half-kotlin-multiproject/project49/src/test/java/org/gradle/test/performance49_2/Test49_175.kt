package org.gradle.test.performance49_2

import org.junit.Assert.*

class Test49_175 {
    private val production = Production49_175("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
