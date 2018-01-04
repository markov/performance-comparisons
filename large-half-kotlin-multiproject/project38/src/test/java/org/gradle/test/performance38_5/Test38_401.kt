package org.gradle.test.performance38_5

import org.junit.Assert.*

class Test38_401 {
    private val production = Production38_401("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}