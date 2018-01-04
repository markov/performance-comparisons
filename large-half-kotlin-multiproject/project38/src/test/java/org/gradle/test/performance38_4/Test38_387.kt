package org.gradle.test.performance38_4

import org.junit.Assert.*

class Test38_387 {
    private val production = Production38_387("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}