package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_124 {
    private val production = Production38_124("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}