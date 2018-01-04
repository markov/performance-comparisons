package org.gradle.test.performance49_3

import org.junit.Assert.*

class Test49_232 {
    private val production = Production49_232("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
