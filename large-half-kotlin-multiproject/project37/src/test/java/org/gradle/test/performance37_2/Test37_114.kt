package org.gradle.test.performance37_2

import org.junit.Assert.*

class Test37_114 {
    private val production = Production37_114("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}