package org.gradle.test.performance38_4

import org.junit.Assert.*

class Test38_342 {
    private val production = Production38_342("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}