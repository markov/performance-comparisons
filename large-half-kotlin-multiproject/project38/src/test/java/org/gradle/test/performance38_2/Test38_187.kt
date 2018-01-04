package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_187 {
    private val production = Production38_187("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}