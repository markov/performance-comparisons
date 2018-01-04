package org.gradle.test.performance37_3

import org.junit.Assert.*

class Test37_213 {
    private val production = Production37_213("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}