package org.gradle.test.performance49_3

import org.junit.Assert.*

class Test49_231 {
    private val production = Production49_231("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
