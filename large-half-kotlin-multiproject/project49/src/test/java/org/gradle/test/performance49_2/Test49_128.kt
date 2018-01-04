package org.gradle.test.performance49_2

import org.junit.Assert.*

class Test49_128 {
    private val production = Production49_128("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
