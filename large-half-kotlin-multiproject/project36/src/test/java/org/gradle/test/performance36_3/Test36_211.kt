package org.gradle.test.performance36_3

import org.junit.Assert.*

class Test36_211 {
    private val production = Production36_211("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}