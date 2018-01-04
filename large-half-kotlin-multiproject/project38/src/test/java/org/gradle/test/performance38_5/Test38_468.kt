package org.gradle.test.performance38_5

import org.junit.Assert.*

class Test38_468 {
    private val production = Production38_468("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}