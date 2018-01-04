package org.gradle.test.performance37_3

import org.junit.Assert.*

class Test37_251 {
    private val production = Production37_251("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}