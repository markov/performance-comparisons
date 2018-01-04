package org.gradle.test.performance49_4

import org.junit.Assert.*

class Test49_332 {
    private val production = Production49_332("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
