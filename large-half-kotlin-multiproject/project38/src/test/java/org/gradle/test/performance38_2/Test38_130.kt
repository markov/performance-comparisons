package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_130 {
    private val production = Production38_130("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}