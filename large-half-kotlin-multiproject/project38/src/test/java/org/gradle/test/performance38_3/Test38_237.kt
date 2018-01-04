package org.gradle.test.performance38_3

import org.junit.Assert.*

class Test38_237 {
    private val production = Production38_237("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}