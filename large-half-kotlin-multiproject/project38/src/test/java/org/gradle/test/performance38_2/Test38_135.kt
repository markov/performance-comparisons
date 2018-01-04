package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_135 {
    private val production = Production38_135("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}