package org.gradle.test.performance37_4

import org.junit.Assert.*

class Test37_398 {
    private val production = Production37_398("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}