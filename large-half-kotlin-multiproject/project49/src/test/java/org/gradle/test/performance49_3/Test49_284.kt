package org.gradle.test.performance49_3

import org.junit.Assert.*

class Test49_284 {
    private val production = Production49_284("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
