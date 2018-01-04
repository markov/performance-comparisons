package org.gradle.test.performance37_2

import org.junit.Assert.*

class Test37_183 {
    private val production = Production37_183("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}