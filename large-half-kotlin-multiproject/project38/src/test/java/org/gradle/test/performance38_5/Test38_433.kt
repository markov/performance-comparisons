package org.gradle.test.performance38_5

import org.junit.Assert.*

class Test38_433 {
    private val production = Production38_433("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}