package org.gradle.test.performance37_4

import org.junit.Assert.*

class Test37_361 {
    private val production = Production37_361("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}