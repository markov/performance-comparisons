package org.gradle.test.performance37_1

import org.junit.Assert.*

class Test37_88 {
    private val production = Production37_88("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}