package org.gradle.test.performance37_2

import org.junit.Assert.*

class Test37_119 {
    private val production = Production37_119("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}