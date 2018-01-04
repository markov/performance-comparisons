package org.gradle.test.performance37_1

import org.junit.Assert.*

class Test37_99 {
    private val production = Production37_99("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}