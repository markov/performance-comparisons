package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_120 {
    private val production = Production38_120("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}