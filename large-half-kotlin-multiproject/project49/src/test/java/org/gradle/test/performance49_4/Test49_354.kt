package org.gradle.test.performance49_4

import org.junit.Assert.*

class Test49_354 {
    private val production = Production49_354("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
