package org.gradle.test.performance49_3

import org.junit.Assert.*

class Test49_254 {
    private val production = Production49_254("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
