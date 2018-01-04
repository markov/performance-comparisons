package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_137 {
    private val production = Production38_137("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}