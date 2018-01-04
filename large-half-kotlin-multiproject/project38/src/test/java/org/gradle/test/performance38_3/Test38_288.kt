package org.gradle.test.performance38_3

import org.junit.Assert.*

class Test38_288 {
    private val production = Production38_288("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}