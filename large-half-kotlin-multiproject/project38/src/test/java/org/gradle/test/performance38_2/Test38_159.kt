package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_159 {
    private val production = Production38_159("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}