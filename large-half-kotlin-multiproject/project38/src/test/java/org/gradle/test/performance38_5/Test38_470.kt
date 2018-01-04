package org.gradle.test.performance38_5

import org.junit.Assert.*

class Test38_470 {
    private val production = Production38_470("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}