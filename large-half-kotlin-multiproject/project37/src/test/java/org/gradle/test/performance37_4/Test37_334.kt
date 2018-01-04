package org.gradle.test.performance37_4

import org.junit.Assert.*

class Test37_334 {
    private val production = Production37_334("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}