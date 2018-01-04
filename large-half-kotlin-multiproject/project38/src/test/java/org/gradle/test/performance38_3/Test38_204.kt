package org.gradle.test.performance38_3

import org.junit.Assert.*

class Test38_204 {
    private val production = Production38_204("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}