package org.gradle.test.performance38_5

import org.junit.Assert.*

class Test38_405 {
    private val production = Production38_405("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}