package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_144 {
    private val production = Production38_144("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}