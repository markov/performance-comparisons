package org.gradle.test.performance38_1

import org.junit.Assert.*

class Test38_1 {
    private val production = Production38_1("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}